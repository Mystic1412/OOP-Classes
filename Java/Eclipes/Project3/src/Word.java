
public class Word implements Comparable <Word>{

	protected String word;
	
	/**
	 * Checks if the string is within a-z and it can repeat if not it throws an IllegalWordException
	 * @param word gets the word
	 */
	public Word(String word) {
		if(!word.matches("[a-z]+")) {
			throw new IllegalWordException("Not all letters are lowercase letters: "+ word);
		}
		this.word = word;
	}
	
	public String getValue() {
		return word;
	}
	
	public String toString() {
		return word;
	}
	
	public int compareTo(Word other) {
		return this.word.compareTo(other.word);
	}
	
	
}
