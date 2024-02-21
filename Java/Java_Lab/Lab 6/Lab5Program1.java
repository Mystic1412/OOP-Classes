import javax.swing.JOptionPane;

public class Lab5Program1 {
	
	public static void main(String[] args) {
		String isOrIsNot, inputWord;
			
		// This line asks the user for input by popping out a single window
		// with text input
		String[] wordArray = new String[10];
        String filename = args[0];
        inputFromFile(filename,wordArray);
        while(true) {
        	inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
		
        	// if the inputWord is contained within wordArray return true
        	if (wordIsThere(inputWord, wordArray)) 
        		isOrIsNot = "is"; // set to is if the word is on the list
        	else
        		isOrIsNot = "is not"; // set to is not if the word is not on the list
		
        	// Output to a JOptionPane window whether the word is on the list or not
        	JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
        }
	}//main
	
	private static int inputFromFile(String filename, int[] numArray) {
		TextFileInput in = new TextFileInput(filename);
		int lengthFilled = 0; 
		String line = in.readLine();
		while ( lengthFilled < numArray.length && line != null ) {
			int tempnum = Integer.parseInt(line);
			numArray[lengthFilled++] = tempnum;
			line = in.readLine(); 
		} // while 
		if ( line != null ) {
			System.out.println("File contains too many numbers.");
		   	System.exit(1); 
	   } 
		in.close();
		return lengthFilled;
}
	
	
	public static boolean wordIsThere(String findMe, int[] theList, int lengthFilled ){	
		int tempinput  = Integer.parseInt(findMe); 
		for (int i = 0; i<theList.length; i++){
			if(tempinput == theList[i]){
				return true;
				}
		}
			return false;
 	} // wordIsThere
} // class Lab4Program1

