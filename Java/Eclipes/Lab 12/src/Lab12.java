import javax.swing.*; //jFrame and JOption.Pane 
import java.awt.*;
public class Lab12{
	//These are  the variables static meaning global variable static also means you can only create 1 instance of that variable 
	//YOu can get access to these static to these files you can access them in different classes
   static TextFileInput inFile;
   static String inFileName = "numbers.txt"; //this is hard coding the files so you don't have to configuration the files names
   static JFrame myFrame;
   static Container cPane;
   static TextArea even, odd;
   
   public static void main(String[] args) {
      initialize();
      readNumbersFromFile(inFileName);
      
   }   
   public static void initialize() {
      inFile = new TextFileInput(inFileName); //this lets you read the txt file
      even = new TextArea(); //making an instance
      odd = new TextArea(); //making an instance
      myFrame=new JFrame(); 
      myFrame.setSize(400,400); //how big it is
      myFrame.setLocation(200, 200); //Location on the screen
      myFrame.setTitle("Even or dd"); 
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //lets user close the gui in the top right button
   }
   public static void readNumbersFromFile(String fileName){
      /*
       * Add code to this method so...
       * - the two text areas are added to the content pane of the JFrame
       *   (see the code in the PowerPoint on GUIs)
       * - numbers are read from the file, and even numbers are put in 
       *   the TextArea "even", odd numbers in "odd".
       * - At end of file, the JFrame is made visible.
       */
	   myFrame.setLayout(new GridLayout(1,2));
	   cPane =myFrame.getContentPane();
	   cPane.add(even);
	   cPane.add(odd);
	   even.append("Even numbers: \n");
	   odd.append("odd numbers: \n");
	   
      String line;
      line = inFile.readLine();
      while (line != null) {
    	  int temp = Integer.parseInt(line); 
		      if(temp%2 ==0) {
		    	  even.append(line+"\n");
		      }
		      else {
		    	  odd.append(line+"\n");
		      }
		      line = inFile.readLine();    	  
          
          
          
          
       } //while
   myFrame.setVisible(true);
   } //readSSNsFromFile
   
      
   
   
   
} //SSN

