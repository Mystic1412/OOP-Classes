import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;

public class PuzzleGUI {
	static TextArea Score;
	
	/**
	 * A GUI so the user can have somewhere to see their score and what they have answered
	 * @param Letter gets the letters used in the game so it can be displayed in the left side of the GUI
	 * @param score initializes the score to 0 so the user can see
	 */
	public PuzzleGUI(char Letter[], int score) {
		JFrame Gamescreen = new JFrame();
		Gamescreen.setSize(300,400);
		Gamescreen.setLocation(100,100);
		Gamescreen.setTitle("Word Game");
		Gamescreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //will stop the program when the user clicks the top right X
		
		Container screen = Gamescreen.getContentPane();
		Score = new TextArea();
		TextArea Letters = new TextArea();
		screen.add(Letters, BorderLayout.EAST);
		screen.add(Score, BorderLayout.WEST);
		
		Gamescreen.setLayout(new GridLayout(1,2));
		Score.setText("Score: "+score+"\nCurrent words found:");
		Letters.append("Create words using: \n");
		for(int i=0; i<Letter.length;i++) { //loops through the array so the user can see their letter options on the GUI screen
			Letters.append(Letter[i] + " ");
		}
		
		Gamescreen.setVisible(true); 
	}
	/**
	 * Helps update the GUI every time the user gets a correct answer
	 * @param Input an array that stores all the solutions that the user has found so it can be should in the GUI
	 * @param score gets the score from project so it can update the score
	 */
	public void UpdateScore(String Input[], int score) {
			Score.setText("Score: "+ Integer.toString(score)+"\nCurrent words found:\n");
			for(int i=0; i<score;i++) {
				Score.append(Input[i]+"\n");
			}
			
		
	}

}
