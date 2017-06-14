
public class KVpair {
	public int key;
	public int e;
	private boolean empty = true;

	// Constructors
	public KVpair() {}
		
	public KVpair(int k, int eval) {
		key = k; 
		e = eval;
		empty = false;
	}

	public int key() { return key; }
		
	public void setKey(int ink) { key = ink; }
		
	public int value() { return e; }
		
	public boolean isEmpty() {
		return empty;
	}
}
