import javax.swing.*;

public class Lab6Program1 {

	public static void main(String[] args) {
	
		String isOrIsNot, inputWord;
			
		// This line asks the user for input by popping out a single window
		// with text input

        int[] numArray = new int[20];
        String filename = args[0];

        int lengthFilled =
		inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
		
		// if the inputWord is contained within wordArray return true
		if (wordIsThere(inputWord, wordArray)) 
			isOrIsNot = "is"; // set to is if the word is on the list
		else
			isOrIsNot = "is not"; // set to is not if the word is not on the list
		
		// Output to a JOptionPane window whether the word is on the list or not
		JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
	} //main

	public static boolean wordIsThere(String findMe, String[] theList){
		while(true){
			if(findMe.equalsIgnoreCase("STOP")){
				System.exit(0);
			}
			
			for (int i = 0; i<8; i++){
				if(findMe.equals(theList[i])){
					return true;
				}
			}
			findMe = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
		}
 	} // wordIsThere
} // class Lab4Program1
