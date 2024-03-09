
import java.awt.GridLayout;
import javax.swing.*;        

public class Lab11 {
    
   public static void main(String[] args) {
        createAndShowGUI();
   }
   
   private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,100);//width, height); how big the GUI is
        frame.setLocation(200,200);//x, y); where you want to let it display on the screen
        frame.setLayout(new GridLayout(2,1)); //the ratio of the GUI

        JTextArea textArea = new JTextArea(5, 20); //New textArea (5,20) is the 5 row and 20 column
        textArea.setEditable(false); //don't let the user change it
        JScrollPane scrollPane = new JScrollPane(textArea); //Lets you scroll up and down the text area
        frame.getContentPane().add(scrollPane); 
        JLabel label = new JLabel("The sum of the numbers in the matrix is: "); //
        frame.getContentPane().add(label); 

        textArea.setText("The matrix should print here"); //if you do another setText it'll replace it if you don't want that to happen do append
        
        //Display the window.
        frame.pack(); //auto adjust the window size
        frame.setVisible(true); //
        
        readAndDisplayMatrix(frame, textArea, label); // you call the method
    }
   
   private static void readAndDisplayMatrix(JFrame myFrame, JTextArea myText,
                                            JLabel myLabel) {
   /*
    * Fill in this method.   
    * It should fill the text area with the matrix (as you did to a
    * message dialog in a previous lab, calculate the sum (code from
    * a previous lab) and set the text of the label to show the sum.
    * Re-display the JFrame using the setVisible(true) method. The
    * matrix is given here.
    */
	   int sum=0;
   
   int[][] myMatrix = {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
   myText.append("\n");
   for(int r=0; r<myMatrix.length; r++) {
	   for(int c=0; c<myMatrix[r].length; c++) {
		   myText.append(String.valueOf(myMatrix[r][c])+ " ");
		   sum += myMatrix[r][c];
		   
	   }
	   myText.append("\n");
	   
   	}
   	myLabel.setText("The sum of the numbers in the matrix is: " + String.valueOf(sum));
   }

        
}