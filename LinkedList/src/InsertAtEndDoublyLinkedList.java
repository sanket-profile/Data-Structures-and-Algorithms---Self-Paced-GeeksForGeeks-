
public class InsertAtEndDoublyLinkedList {

	public static DoubleNode insertAtEndDoublyLinkedList(DoubleNode head , int x) {
		DoubleNode temp = head;
		if(head == null) {
			return new DoubleNode(x);
		}
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new DoubleNode(x);
		temp.next.prev = temp;
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
		head = insertAtEndDoublyLinkedList(head, 5);
		InsertAtBeginOfDoublyLinkedList.traversingALinkedListInJava(head);
	}

}
