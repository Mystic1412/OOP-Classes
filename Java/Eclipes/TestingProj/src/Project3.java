import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;

import javax.swing.*;

public class Project3 {
	static int Correct_Count =0, AllLettersCorrect =0;
	static char[] Letter = null;
	static char FirstLetter = 'a'; //using 'a' as a place holder
	static SortedWordList sortedWordList = new SortedWordList();
	static UnsortedWordList unsortedWordList = new UnsortedWordList();
	static File selectedFile = null; 
	
    public static void main(String[] arg) throws IOException{ 	
    	PuzzleGUI Game = new PuzzleGUI(Correct_Count); //shows the initial GUI without the letters so the user can select the file from the menu bar
    	FileMenuHandler fileMenuHandler = new FileMenuHandler(Game, null);
    	
    	//Runs so it lets the user select the file before the game starts
    	while(selectedFile == null) {
    		selectedFile = fileMenuHandler.getSelectedFile();
    		try {
                Thread.sleep(100); // Sleep for a short while to avoid busy-waiting
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    	}
    	
    	readFile(selectedFile);
    	Game.Update(Letter, Correct_Count);
    	
    	while(true) { //continue to run the program until either the user types stop or they find all of the answer to the solution
    		
    		String UserInput = JOptionPane.showInputDialog("Enter a Word: ");
    		if(UserInput.equalsIgnoreCase("STOP")){ //checks if the user types stop so the program can stop
                System.exit(0);
            }
    		try {
    			Word Checking = new Word(UserInput);
    		}catch (IllegalWordException e) {
    			System.out.println("IllegalWordException: "+ e.getMessage()); //catches the inputs that has anything other than lowercase letters
    		}
    		
    		while(CheckingLetters(UserInput, Letter, FirstLetter)==false || UserInput.length()<5){
            	if(UserInput.equalsIgnoreCase("STOP")){ //checks if the user types stop so the program can stop
                    System.exit(0);   
                }
            	try {
        			Word Checking = new Word(UserInput);
            	}catch (IllegalWordException e) {
        			System.out.println("IllegalWordException: "+ e.getMessage());
        		}
            	if (!UserInput.contains(String.valueOf(FirstLetter))) { //checks specifically for the first letter
                	UserInput = JOptionPane.showInputDialog("TRY AGAIN\nMust contain the letter: "+ FirstLetter);
                }else {
                UserInput = JOptionPane.showInputDialog("TRY AGAIN\nMust be 5 letters long & using ONLY the provided letters in lowercase!");
                }
            	
            }
    		
    		if(CheckWordMatch(UserInput, unsortedWordList, sortedWordList)) { //if it's true it'll update the GUI with the correct word and the score
    			
    			if(UserInput.contains(String.valueOf(Letter[0]))&&
    			   UserInput.contains(String.valueOf(Letter[1]))&&
    			   UserInput.contains(String.valueOf(Letter[2]))&&
    			   UserInput.contains(String.valueOf(Letter[3]))&&
    			   UserInput.contains(String.valueOf(Letter[4]))&&
    			   UserInput.contains(String.valueOf(Letter[5]))){	
    				AllLettersCorrect++; //adds 3 points for correct answers with using all the given letters
    			}else {
    				Correct_Count++; //correct answers score counter
    				}
    
    			Game.UpdateScore(sortedWordList, Correct_Count,AllLettersCorrect, UserInput); 
    			if(Correct_Count+(3*AllLettersCorrect) == FileLength(selectedFile.getAbsolutePath())+(3*AllLettersCorrect)-AllLettersCorrect) { //when the score is the 3 times the length of the file, it means they found all the solutions and it will show a message that tells the user they won and stops the program
    				JOptionPane.showMessageDialog(null, "Congrats You guessed all the possible soultions! :D");
    				int result = JOptionPane.showConfirmDialog(null, "You want to play again?","Play Again?", JOptionPane.YES_NO_OPTION);
    				if(result == JOptionPane.YES_OPTION) { //will reset the game so the user can play again
    					Correct_Count = 0;
    					AllLettersCorrect =0;
    					Game.ResetGame(sortedWordList, Correct_Count,AllLettersCorrect);
    				}else { //closes the game if the user doesn't want to play again.
    					System.exit(0);
    				}
    			}
    	        
    			
    		}else {
    			JOptionPane.showMessageDialog(null, "That's not a possible soultions! :/"); //tells for not possible solutions and repeated answers
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
     * Checks to see if the user inputed word is a correct word and not a repeated word that they have already guessed
     * @param InputedWord gets the word that the user enters so it can be checked if it is in the solution file
     * @param unsortedlist has all the solutions so it can be used to check the user's input
     * @param sortlist looks through the sorted list to find repeats so it won't be added 
     * @return false for either not a solution or a repeated answer 
     */
	public static boolean CheckWordMatch(String InputedWord, UnsortedWordList unsortedlist, SortedWordList sortlist) {
    	if(sortlist.first == null) {
    		return false;
    	}
		
		WordNode current = unsortedlist.first.next; //skipping the dummy node
    	WordNode sortcurrent = sortlist.first.next; //skipping the dummy node
    	
    	while (current != null) { // Loop through each node in the linked list and compare it to the user input
    		if(current.data.toString().equals(InputedWord) ) {
    			while(sortcurrent != null) {
    				if(sortcurrent.data.toString().equals(InputedWord)) {
    					return false;
    				}
        			
        			sortcurrent = sortcurrent.next;
        		}
    			return true;
    		}
    		current = current.next; // moves to the next node
    		 // moves to the next node
            }
			return false;  
    	
    }
    
	
	/**
	 * Checks for if the user used only the letters given and the first letter of the given letters
	 * @param UserInputed Gets the word that the used enters 
	 * @param Letter_arr an array containing the allowed letters to be used
	 * @param FirstLetter check if it has the first letter
	 * @return true for using only the given letters and has the first letter somewhere in the answer false if not
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
    
    public void setSelectedFile(File file) {
    	Project3.selectedFile = file;
    }
    
    
    /**
     * Gets the user selected file so it can read it and store the Letters allowed to use into the Letter array
     * Sets the Firstletter from the Letter array
     * stores all the answers into the unsortedWordList
     */
    public static void readFile(File file) {
    	try (BufferedReader bReader = new BufferedReader(new FileReader(file))){
    		String Firstline = bReader.readLine(); //reads the first line of the txt file
    		Letter = new char[Firstline.length()];
    		for (int i=0; i<Firstline.length(); i++) { // from the first line it puts all the characters into a Letter array to use
    			Letter[i]= Firstline.charAt(i);
    			
    		}
    		FirstLetter = Letter[0]; //gets the first letter
    		
            String line = bReader.readLine();
            while (line != null) {
            	unsortedWordList.add(new Word(line));
            	line = bReader.readLine();
            	
            }
            
    	}catch (IOException e) {
 			e.printStackTrace();
 		}
    }
}
