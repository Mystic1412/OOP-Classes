import java.util.*; //star is all the library and so we use this to import the whole library
/*
 * This application demonstrates the use of a StringTokenizer.
 * It will open a file, read a line with tokens separated by commas,
 * declare an array whose size is equal to the number of the tokens, 
 * extract each token one by one from the tokenized String and
 * store each string in an array.
 */
public class Tokens {
   public static TextFileInput myFile; 
   public static StringTokenizer myTokens;
   public static String animal;
   public static String[] animals;
   public static String line;
   
 
   public static void main(String[] args) {
   /*
    * Open the file and read a line   
    */
      myFile = new TextFileInput("animals.txt"); //this gives access to animals.txt
      line = myFile.readLine(); //return the current line
      System.out.println("The input line is "+line); //this prints out the line
   /*
    * Create a new StringTokenizer, passing the String and the delimeter (",")
    */
      myTokens = new StringTokenizer(line,","); //StringTonenizer is a method in the library second paramemeter can be any separate like (space) or like a ,
      System.out.println("There are "+myTokens.countTokens()+" tokens in the line."); //myTokens.countTokens() return the amount of tocken numbers
   /*
    * Declare an array whose size is equal to the number of tokens found
    * using the method countTokens from the StringTokenizer class
    */
      animals = new String[myTokens.countTokens()]; //creating a new string array with a size of 7 because of the .countToken()
   /*
    * Get the separated strings one by one from the StringTokenizer and put
    * them in the array   
    */
      int i=0;
      while (myTokens.hasMoreTokens()) { //Checks the tokens
         animals[i]=myTokens.nextToken();	//moves to next line
         i++;
      } //by the end of the while loop there should have been made an array
    /*
     * Print the array
     */
      for (int j=0;j<animals.length;j++)
         System.out.println(animals[j]);  
   } //main

} //Tokens
