
public class DeleteHeadOfADoublyLinkedList {

	public static DoubleNode deleteHeadOfADoublyLinkedList(DoubleNode head) {
		if(head == null || head.next == null) {
			return null;
		}
		head = head.next;
		head.prev = null;
		return head;
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
		head = deleteHeadOfADoublyLinkedList(head);
		InsertAtBeginOfDoublyLinkedList.traversingALinkedListInJava(head);
	}

}
