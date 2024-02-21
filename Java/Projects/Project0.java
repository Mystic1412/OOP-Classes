import javax.swing.*;

public class Project0 {
    //user input a sentence, using a JOptionPane.showInputDialog()
    String UserSentence = JOptionPane.showInputDialog("Enter a sentence");
    //count uppercase E and lowercased e, using charAt method
    //Using a JOptionPane.showMessageDialog(), 
    //tell the user how many upper and lower case e's were in the string.
    //Repeat aka loop it until the user types "STOP" 27

    public static int Counte(String sentence){
        while(true){
            if(sentence.equalsIgnoreCase("STOP")){
                System.exit(0);
            }
            
            

        }

        
    }
}
