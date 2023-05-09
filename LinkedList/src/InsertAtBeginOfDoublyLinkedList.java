
class DoubleNode{
	int val;
	DoubleNode next;
	DoubleNode prev;
	DoubleNode(int x){
		this.val = x;
		this.next = null;
		this.prev = null;
	}
}

public class InsertAtBeginOfDoublyLinkedList {

	public static DoubleNode insertAtBeginOfDoublyLinkedList(DoubleNode head , int x) {
		if(head == null) {
			return new DoubleNode(x);
		}
		DoubleNode temp = head;
		head = new DoubleNode(x);
		head.prev = null;
		head.next = temp;
		temp.prev = head;
		return head;
	}
	public static void traversingALinkedListInJava(DoubleNode head) {
		DoubleNode temp = head;
		while(temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
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
		head = insertAtBeginOfDoublyLinkedList(head, 5);
		traversingALinkedListInJava(head);
	}

}
