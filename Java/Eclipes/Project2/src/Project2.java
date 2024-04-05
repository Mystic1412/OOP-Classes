import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import javax.swing.*;

public class Project2 {
    public static void main(String[] arg) throws IOException{
    	int Correct_Count =0;
    	char[] Letter = null;
    	char FirstLetter = 'a';
    	
    	String file = arg[0]; //gets the file from the first commend argument
    	try (BufferedReader bReader = new BufferedReader(new FileReader(file))){
    		String Firstline = bReader.readLine(); //reads the first line of the txt file
    		Letter = new char[Firstline.length()];
    		for (int i=0; i<Firstline.length(); i++) { // from the first line it puts all the characters into a Letter array to use
    			Letter[i]= Firstline.charAt(i);
    		}
    		FirstLetter = Letter[0]; //gets the first letter
    		System.out.print(FirstLetter); //DELETE LATER
    	}
    	 catch (IOException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    	
    	String WordFound[] = new String[FileLength(file)];
    	PuzzleGUI Game = new PuzzleGUI(Letter, Correct_Count);
    	
    	while(true) { //continue to run the program until either the user types stop or they find all of the answer to the solution
    		
    		String UserInput = JOptionPane.showInputDialog("Enter a Word: ");
    		UserInput = UserInput.toLowerCase(); //Turns the user input into all lower case
    		if(UserInput.equalsIgnoreCase("STOP")){ //checks if the user types stop so the program can stop
                System.exit(0);
            }
    		
    		while(CheckingLetters(UserInput, Letter, FirstLetter)==false || UserInput.length()<5){
            	if(UserInput.equalsIgnoreCase("STOP")){ //checks if the user types stop so the program can stop
                    System.exit(0);
                }else if (!UserInput.contains(String.valueOf(FirstLetter))) { //checks specifically for the first letter
                	UserInput = JOptionPane.showInputDialog("TRY AGAIN\nMust contain the letter: "+ FirstLetter);
                    UserInput = UserInput.toLowerCase(); 
                }else {
                UserInput = JOptionPane.showInputDialog("TRY AGAIN\nMust be 5 letters long & using ONLY the provided letters");
                UserInput = UserInput.toLowerCase(); 
                }
            }
    		if(CheckWordMatch(UserInput, file)) { //if it's true it'll update the GUI with the correct word and +1 to the score
    			WordFound[Correct_Count/3] = UserInput;
    			Correct_Count +=3;
    			Game.UpdateScore(WordFound, Correct_Count); 
    			if(Correct_Count == FileLength(file)) { //when the score is the length of the file, it means they found all the solutions and it will show a message that tells the user they won and stops the program
    				JOptionPane.showMessageDialog(null, "Congrats You guessed all the possible soultions! :D");
    				System.exit(0);
    			}
    			
    		}else {
    			JOptionPane.showMessageDialog(null, "That's not a possible soultions! :/");
    		}
    		
    	} //end of while(true)
        
    }
    
    
    /**
     * This method returns the how long the file is so it can be used to set the size of the array for how many correct solutions there are
     * @param file the unique txt file to be 
     * @return count which gives you back the amount of correct solution and it's -1 because the first line doesn't count since its just giving the letter to be used
     * @throws IOException
     */
    public static int FileLength(String file) throws IOException {
    	int count=0;
    	String filePath = file;// gets the text file
        FileReader fileReader = new FileReader(filePath); //read the text file
        BufferedReader bufferedReader = new BufferedReader(fileReader); //read the file line by line
        String line = bufferedReader.readLine(); // Read the first line

        
        while (line != null) { // Loop through each line in the file and compare it to the user input
            count++;
        	line = bufferedReader.readLine(); // Read the next line
        }

        bufferedReader.close();
        fileReader.close();
    	return count-1; //return the amount of solutions and -1 to get rid of the first line that was counted since it was just the letter provided
    }
    
    
    /**
     * This method checks if the word that the user enter that is using the correct letters and longer than 5 letters is in the files with all the solutions words
     * @param InputedWord gets the word that the user enters so it can be checked if it is in the solution file
     * @param file the file that has all the solutions so it can be used to check the user's input
     * @return	if returns true it'll make the GUI update if false it'll show the message that it wasn't an answer in the file
     */
    public static boolean CheckWordMatch(String InputedWord, String file) {
    	try{
            String filePath = file;// gets the text file
            FileReader fileReader = new FileReader(filePath); //read the text file
            BufferedReader bufferedReader = new BufferedReader(fileReader); //read the file line by line
            String line = bufferedReader.readLine(); // Read the first line

            
            while (line != null && !line.equals(InputedWord)) { // Loop through each line in the file and compare it to the user input
                line = bufferedReader.readLine(); // Read the next line
            }

            bufferedReader.close();
            fileReader.close();

            // Check if a match was found
            if (line != null) {
                return true;
            } 
        }catch (IOException e) {
            e.printStackTrace();
        }
    	return false;
    }
    
    /**
     * This method checks to see if the word that was entered by the user has ONLY the letters from the array and returns a true if it's only letters from the array and false if there's a letter that's not in this array. 
     * 
     * @param UserInputed Gets the word that the used enters 
     * @param Letter_arr an array containing the allowed letters to be used
     * @return
     */
    public static boolean CheckingLetters(String UserInputed, char Letter_arr[], char FirstLetter){
        int count = 0;
        for(int user=0; user<UserInputed.length();user++){
            for(int i =0; i<Letter_arr.length;i++){
                if(Letter_arr[i] == UserInputed.charAt(user)){
                    count++;
                }	
            }
        }	
        if (count ==UserInputed.length() && UserInputed.contains(String.valueOf(FirstLetter))){
        	return true;
        }else return false;
    }
}
