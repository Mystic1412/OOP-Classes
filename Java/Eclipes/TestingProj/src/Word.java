
public class Word implements Comparable <Word>{

	protected String word;
	
	public Word(String word) {
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
