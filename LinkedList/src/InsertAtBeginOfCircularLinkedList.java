
public class InsertAtBeginOfCircularLinkedList {

	public static Node insertAtBeginOfCircularLinkedList(Node head , int x) {
		Node temp = head;
		Node temp1 = head;
		if(head == null) {
			head = new Node(x);
			head.next = head;
			return head;
		}
		while(temp.next != head) {
			temp = temp.next;
		}
		temp.next = null;
		head = new Node(x);
		head.next = temp1;
		temp.next = head;
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		head.next = second;
		second.next = third;
		third.next = head;
		head = insertAtBeginOfCircularLinkedList(null , 5);
		CircularLinkedListTraversalInJava.circularLinkedListTraversalInJava(head);
	}

}
