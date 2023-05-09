
public class ReverseADoublyLinkedList {

	public static DoubleNode reverseADoublyLinkedList(DoubleNode head) {
		DoubleNode prev = null;
		DoubleNode temp = head;
		if(head == null || head.next == null) {
			return head;
		}
		while(temp != null) {
			prev = temp.prev;
			temp.prev = temp.next;
			temp.next = prev;
			temp = temp.prev;
		}
		return prev.prev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleNode head = new DoubleNode(10);
		DoubleNode second = new DoubleNode(20);
		DoubleNode third = new DoubleNode(30);
		head.next = second;
		second.prev = head;
		second.next = third;
		third.prev = second;
		head = reverseADoublyLinkedList(head);
		InsertAtBeginOfDoublyLinkedList.traversingALinkedListInJava(head);
	}

}
