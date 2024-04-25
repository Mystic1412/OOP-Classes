import javax.swing.*;
import java.awt.event.*;
import java.io.*;


public class FileMenuHandler implements ActionListener {
   JFrame jframe;
   Project3 project;
   File selectedFile;
   
   public FileMenuHandler (JFrame jf, Project3 pro) {
      jframe = jf;
      project = pro;
      selectedFile = null;
   }
   
   /**
    * Listens to the User's actions and executes what the user selected 
    * Reads the File the user choose and gets send back to the main file
    */
   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand();
      
      if (menuName.equals("Open")) {
        JFileChooser ChooseFile = new JFileChooser();
      	int returnValue = ChooseFile.showOpenDialog(null);
      	
      	if(returnValue == JFileChooser.APPROVE_OPTION) {
      		File selectedFile = ChooseFile.getSelectedFile();
      		project.setSelectedFile(selectedFile);
      		project.readFile(selectedFile);
      	}
      	
      }else if (menuName.equals("Quit"))
          System.exit(0);
   } //actionPerformed
   
   public File getSelectedFile() {
	   return selectedFile;
   }
}