import javax.swing.*;
public class Project1 {
    public static void main(String[] arg){
    // while(true){
    //     if(UserSentence.equalsIgnoreCase("STOP")){ //checks if the user types stop so the program can stop
    //         System.exit(0);
    //     }
    // }
        //LETTERS: A E I L N S T
        char Letters[]= {'A','E','I','L','N','S','T'}; //These are the letter options
        String UserInput = JOptionPane.showInputDialog("Using the letters:\nA E I L N S T");
        UserInput = UserInput.toUpperCase(); //Turns the user input into all capital

        // for (int Input_i=0; Input_i<UserInput.length();Input_i++){
        //     for(int Letter_i=0; Letter_i<7;Letter_i++){
        //         if(UserInput.charAt(Input_i)==Letters[Letter_i]){
        //         }
        //         // else UserInput = JOptionPane.showInputDialog("TRY AGAIN!\nUsing  ONLY the letters:\nA E I L N S T");
        //     }
        // }

        

    }
    public static boolean CheckingLetters(String UserInputed, char Letter_arr[]){
        for (int Letter_i=0; Letter_i<Letters.length;Letter_i++){
            for(int User_i=0; User_i< UserInput.length(); User_i++){
                if(Letters[Letter_i]!= UserInput.charAt(User_i)){
                    UserInput = JOptionPane.showInputDialog("TRY AGAIN!\nUsing  ONLY the letters:\nA E I L N S T");
                }
            }
        }
    }
}
