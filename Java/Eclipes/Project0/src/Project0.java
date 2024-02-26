import javax.swing.JOptionPane;

public class Project0 {
    public static void main(String[] args){
        
        while(true){ //keep making the user to type a sentence until they type 'stop'
            String UserSentence = JOptionPane.showInputDialog("Enter a sentence"); //creates the the gui so the user have a place to input

            if(UserSentence.equalsIgnoreCase("STOP")){ //checks if the user types stop so the program can stop
                System.exit(0);
            }

            
            int Upper_E = 0, Lower_e= 0;
            for(int i=0; i<UserSentence.length();i++){ //loops through each character from the sentence
                if(UserSentence.charAt(i) == 'E') Upper_E++;//counts the upper case E's 
                if(UserSentence.charAt(i) == 'e') Lower_e++;//counts the upper case e's
            }
            
            JOptionPane.showMessageDialog(null, "Number of lower case e's: "+Lower_e+"\nNumber of upper case E's: "+Upper_E);
        }
    }
}
