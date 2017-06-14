
public class ListNode<E> {
	public ListNode<E> next;
	public E element;
	
	public ListNode() {
		next = null;
	}
	
	public ListNode(ListNode<E> nextval, E e) {
		element = e;
		next = nextval;
	}
}
