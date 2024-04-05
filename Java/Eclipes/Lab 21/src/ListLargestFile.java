import java.io.File;
import javax.swing.*;
public class ListLargestFile {
	
	static String filename = "";
	static double filesize = 0;
	
	public static void main(String[] args) {
        JFileChooser fd = new JFileChooser();
//        mode - the type of files to be displayed:
//            * JFileChooser.FILES_ONLY
//            * JFileChooser.DIRECTORIES_ONLY
//            * JFileChooser.FILES_AND_DIRECTORIES 
        fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fd.showOpenDialog(null); //pop up window
		File f = fd.getSelectedFile();
		listFiles(f,"");

	}
	public static void listFiles(File f, String indent) {
		File files[] = f.listFiles();
		for (int i = 0; i<files.length; i++) {
			File f2 = files[i];
			
			if(filesize <f2.length()) {
				filesize = f2.length();
				filename = f2.getName();
			}
            if (f2.isDirectory()) listFiles(f2, indent+"   ");
		}
		
		System.out.println(filename+"..."+ filesize );
	}
}
