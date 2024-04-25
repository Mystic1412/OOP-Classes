import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;

public class PuzzleGUI extends JFrame{
	static TextArea Score;
	static TextArea Letters;
	/**
	 * A GUI so the user can have somewhere to see their score and what they have answered 
	 * @param score initializes the score to 0 so the user can see
	 */
	public PuzzleGUI(int score) {
		setSize(300,400);
		setLocation(100,100);
		setTitle("Word Game");

		Container screen = getContentPane();
		Score = new TextArea();
		Letters = new TextArea();
		screen.add(Letters, BorderLayout.EAST);
		screen.add(Score, BorderLayout.WEST);
		
		setLayout(new GridLayout(1,2));
		Score.setText("Score: "+score+"\nCurrent words found:");
		Letters.append("Create words using: \n");
		menu();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //will stop the program when the user clicks the top right X
		setVisible(true); 
	}
	
	/**
	 * Updates the GUI so it shows the letters after the file is selected
	 * @param Letter gets the letters used in the game so it can be displayed in the left side of the GUI
	 * @param score updates the score
	 */
	public void Update(char Letter[], int score) {
		for(int i=0; i<Letter.length;i++) { //loops through the array so the user can see their letter options on the GUI screen
			Letters.append(Letter[i] + " ");
		}
	}
	
	/**
	 * Helps update the GUI every time the user gets a correct answer
	 * @param sortedWordList used to put the correct answer in and to display the answer in alphabetical order
	 * @param score gets the score from project so it can update the score
	 * @param Correct_Ans adds the correct answer into the sorted linked list
	 */
	public void UpdateScore(SortedWordList sortedWordList, int score,int bonus3,String Correct_Ans) {
		Score.setText("Score: "+ Integer.toString(score+(3*bonus3))+"\nCurrent words found:\n");
		sortedWordList.add(new Word(Correct_Ans));
		WordNode current = sortedWordList.first.next; //skipping the dummy node

		for(int i = 0; current!= null && i < sortedWordList.length; i++) {
    		Word word = current.data;
    		Score.append(word.toString()+"\n");
    		current = current.next; // moves to the next node
            } 
		
		
	}
	
	/**
	 * Resets the GUI and the whole game so its brand new
	 * @param sortedWordList Gets the sortedWordList so it can reset
	 * @param score To reset the score board
	 * @param bonus3 To reset the score board 
	 */
	public void ResetGame(SortedWordList sortedWordList, int score,int bonus3) {
		sortedWordList.RemoveAnswers();
		Score.setText("Score: "+ Integer.toString(score+(3*bonus3))+"\nCurrent words found:\n");
	}
	
	public void menu() {
		JMenuItem item;
		
		JMenuBar menuBar  = new JMenuBar();
	      
	    JMenu fileMenu = new JMenu("File");
	    Project3 project = new Project3();
	    FileMenuHandler mh = new FileMenuHandler(this, project);
	    
	    item = new JMenuItem("Open");
	    item.addActionListener(mh);
	    fileMenu.add(item);
	    
	    fileMenu.addSeparator();
	      
	    item = new JMenuItem("Quit");
	    item.addActionListener(mh);
	    fileMenu.add(item);
	      
	    setJMenuBar(menuBar);
	    menuBar.add(fileMenu);
	}
	
	
}
