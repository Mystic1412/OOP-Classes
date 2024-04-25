
public abstract class WordList {
	
	protected WordNode first = new WordNode(null);
	protected WordNode last = first;
	protected int length = 0;
	
	public int getLength() {
		return length;
	}
	
	
	/**
	 * adds the object to the end of the node
	 * @param w gets the object to append
	 */
	public void append(Word w) {
		WordNode n = new WordNode(w);
		last.next = n;
		last = last.next;
		last.next = null;
		length++;
		
	}
	
}
