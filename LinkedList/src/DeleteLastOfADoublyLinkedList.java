
public class DeleteLastOfADoublyLinkedList {

	public static DoubleNode deleteLastOfADoublyLinkedList(DoubleNode head) {
		DoubleNode temp = head;
		if(head == null || head.next == null) {
			return null;
		}
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.prev.next = null;
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
		head = deleteLastOfADoublyLinkedList(head);
		InsertAtBeginOfDoublyLinkedList.traversingALinkedListInJava(head);
	}

}
