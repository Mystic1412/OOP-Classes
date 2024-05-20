import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Project4 {

	public static void main(String[] args) {
		TreeMap<String, Integer> Words = new TreeMap<>();
		JFileChooser fd = new JFileChooser();
		fd.setFileSelectionMode(JFileChooser.APPROVE_OPTION);
		fd.showOpenDialog(fd);
		File f = fd.getSelectedFile();
		AddWords(f, Words);
		print(Words);
	}
	
	/**
	 * Reads the file that the user selected and add it to the tree map while getting rid of whitespace and punctuations
	 * @param f gets the selected file
	 * @param Words get the TreeMap
	 */
	public static void AddWords(File f, TreeMap<String, Integer> Words) {
		try {
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line;
            while ((line = reader.readLine()) != null) {
            	String[] words = line.split("[\\s\\p{Punct}&&[^+]]+"); //gets rid of whitespace and punctuation
            	for(String word:words) {
            		Words.put(word, Words.getOrDefault(word, 0) + 1); // adds new word and if the word is already in the TreeMap it will +1 to the count
            	}
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	/**
	 * Prints out the words in the tree map while also printing out the amount of time it showed up.
	 * @param Words gets the TreeMap
	 */
	public static void print(TreeMap<String, Integer> Words) {
		for (Map.Entry<String, Integer> entry : Words.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
		
	}
}
