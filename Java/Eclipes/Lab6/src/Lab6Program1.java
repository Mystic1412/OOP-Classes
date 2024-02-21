import javax.swing.JOptionPane;

public class Lab6Program1 {
	
	public static void main(String[] args) {
		//String[] wordArray = { "hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon" };
		String isOrIsNot, inputWord;
			
		// This line asks the user for input by popping out a single window
		// with text input
		//Lab 6 int array with larger size aka change the array below
		String[] wordArray = new String[10];
		//Lab 6: fill in the numArray and return a length been filled number
        String filename = args[0];
        inputFromFile(filename,wordArray);
        while(true) {
        	inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
		
        	// if the inputWord is contained within wordArray return true
        	//Lab 6 add 4rd argument for lengthFilled
        	if (wordIsThere(inputWord, wordArray)) 
        		isOrIsNot = "is"; // set to is if the word is on the list
        	else
        		isOrIsNot = "is not"; // set to is not if the word is not on the list
		
        	// Output to a JOptionPane window whether the word is on the list or not
        	JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
        }
	}//main
	
	
	//Lab 6: fill in the int arry, return the lengthfilled
	
	private static void inputFromFile(String filename,String[] wordArray) {
		TextFileInput in = new TextFileInput(filename);
		int lengthFilled = 0; 
		String line = in.readLine();
		while ( lengthFilled < wordArray.length && line != null ) {
			//add the Integer.ParseInt to covert String type line to int type
			wordArray[lengthFilled++] = line;
			line = in.readLine(); 
		} 
		   if ( line != null ) {
			   System.out.println("File contains too many numbers.");
			   System.exit(1); 
		   } 
		   in.close();
}
	
	//lab 6 add 3rd argument lengthfilled to avoid null pointer
	public static boolean wordIsThere(String findMe, String[] theList){
		//while(true){
//			if(findMe.equalsIgnoreCase("STOP")){
//				System.exit(0);
//			}
//			
			for (int i = 0; i<theList.length; i++){
				if(findMe.equals(theList[i])){
					return true;
				}
			}
			return false;
			//findMe = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
		}
 	} // wordIsThere
} // class Lab4Program1

