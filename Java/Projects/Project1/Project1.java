import java.io.FileReader;

import javax.swing.*;
public class Project1 {
    public static void main(String[] arg){
        //static String inFileName = "numbers.txt";
        FileReader 
        while(true){
            //LETTERS: A E I L N S T
            char Letters[]= {'a','e','i','l','n','s','t'}; //These are the letter options
            String UserInput = JOptionPane.showInputDialog("Using the letters:\nA E I L N S T");
            System.err.println(UserInput);
            UserInput = UserInput.toLowerCase(); //Turns the user input into all lower case
            System.err.println(CheckingLetters(UserInput, Letters));

            if(UserInput.equalsIgnoreCase("STOP")){ //checks if the user types stop so the program can stop
                System.exit(0);
            }
            
            while(CheckingLetters(UserInput, Letters)==false){
                UserInput = JOptionPane.showInputDialog("TRY AGAIN\nUsing ONLY these letters:\nA E I L N S T");
                UserInput = UserInput.toLowerCase(); 
            }

            while(UserInput.length()<4){
                UserInput = JOptionPane.showInputDialog("TRY AGAIN\nMust be 5 letters long\nUsing  these letters:\nA E I L N S T");
                UserInput = UserInput.toLowerCase(); 
            }
            
            
            
        }
        }

    public static boolean CheckingLetters(String UserInputed, char Letter_arr[]){
        int count = 0;
        for(int user=0; user<UserInputed.length();user++){
            for(int i =0; i<Letter_arr.length;i++){
                if(Letter_arr[i] == UserInputed.charAt(user)){
                    count++;
            }
        }
    }
    if (count ==UserInputed.length()){
        return true;
    }else return false;
    }

    

}
