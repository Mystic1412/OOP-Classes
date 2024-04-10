
public class SortedWordList extends WordList{

	public SortedWordList() {
		super();
	}
	
	/**
	 * adds to the linked list and sort it in alphabetical order
	 * @param word gets the word from the main file
	 */
	public void add(Word word) {
		WordNode newNode = new WordNode(word); //Storing the word to use to compare with other nodes
		WordNode current = first.next; 
		WordNode previous = first; //keeps track of the previous node
		
		while(current != null && word.compareTo(current.data) > 0) {
			previous = current;
			current = current.next;
		}
		
		newNode.next = current;
		previous.next = newNode;
		
		if(current == null) {
			last = newNode;
		}
		
		length++;
	}

	

}
