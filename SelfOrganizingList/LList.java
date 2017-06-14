
public class LList<E> {
	private ListNode<E> head;
	private ListNode<E> tail;
	private ListNode<E> curr;
	private int size;
	private int comp;
	
	public LList() {
		head = tail = curr = new ListNode<E>();
		size = 0;
		comp = 0;
	}
	
	public void append(E e) {
		tail.next = new ListNode<E>(null, e);
		tail = tail.next;
		size++;
	}
	
	public void resetTail() {
		while(tail.next != null)
			tail = tail.next;
	}
	
	public int getComp() {
		return comp;
	}
	
	public void MTF(E e) {
		curr = head;
		
		for(int i = 0; i < size; i++) {
			comp++;		
			//if found break out of loop
			if(e.equals(curr.next.element)) {
				ListNode<E> temp = curr.next;	//store the node
				curr.next = curr.next.next;
				temp.next = head.next;
				head.next = temp;
				break;
			}
			curr = curr.next;
		}
		resetTail();	
	}
	
	public void print() {
		curr = head;
		for(int i = 0; i < size; i++) {
			System.out.print(curr.next.element + " ");
			curr = curr.next;
		}
		System.out.println();
	}
}
