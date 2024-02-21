import javax.swing.JOptionPane;

public class Learning {
    public static void main(String[] args){
        //float variable need to be followed w/ 'f' ie 3.1415926f
        float pi_short= 3.14159f; //4 bytes
        double pi = 3.1415926; //8bytes
        System.out.print("The numbers of pi is "+pi);

        //GUI using javax.swing.JOptionPane
        String name= JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+ name);

        //Doing integers
        int Age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); 
        //(data type).parseInt changes the JOptionPane from a string to a integer
        JOptionPane.showMessageDialog(null, "You are "+Age+" years old!");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your age")); 
        //(data type).parseDouble changes the JOptionPane from a string to a double
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");

    }
}