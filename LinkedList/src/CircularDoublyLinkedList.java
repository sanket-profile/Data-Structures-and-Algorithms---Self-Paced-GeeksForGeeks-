
public class CircularDoublyLinkedList {
	
	public static void traversingALinkedListInJava(DoubleNode head) {
		DoubleNode temp = head;
		while(temp.next != head) {
			System.out.println(temp.val);
			temp = temp.next;
		}
		System.out.println(temp.val);
	}

	public static DoubleNode insertAtStartCircularDoublyLinkedList(DoubleNode head , int x) {
		DoubleNode temp = head;
		if(head == null) {
			head = new DoubleNode(x);
			head.next = head;
			head.prev = head;
			return head;
		}
		head = new DoubleNode(x);
		head.next = temp;
		head.prev = temp.prev;
		temp.prev.next = head;
		temp.prev = head;
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
		third.next = head;
		head.prev = third;
		head = insertAtStartCircularDoublyLinkedList(head,5);
		traversingALinkedListInJava(head);
	}

}
