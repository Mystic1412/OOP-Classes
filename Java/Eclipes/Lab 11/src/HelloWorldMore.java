import javax.swing.*;        //this has jframe and jOption panel

public class HelloWorldMore {
    /**
     * Create the GUI and show it.  
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default close option aka the X button in the top right corner

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World"); //creating a new jlabel which lets you attact the stuff like text in it
        frame.getContentPane().add(label);

        //Display the window.
        frame.pack(); //let it auto adjust the window of the GUI just enough to cover the window size
        frame.setVisible(true); //LEts user see the GUI 
        
        String moreToSay = JOptionPane.showInputDialog(null,"What else shall I say?"); //output a GUI that lets the user to input
        label.setText(moreToSay); //replace the user's input
        frame.setVisible(true); 
    }

    public static void main(String[] args) {
         createAndShowGUI();
    }
        
}

