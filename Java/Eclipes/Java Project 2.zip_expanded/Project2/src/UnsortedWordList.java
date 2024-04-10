
public class UnsortedWordList extends WordList{

	public UnsortedWordList() {
		super();
	}
	
	/**
	 * added the word to the end of the linked list
	 * @param word gets the word from the main file 
	 */
	public void add(Word word) {
		append(word);
	}
}
