
public class InsertAtTheEndOfCircularLinkedList {

	public static Node insertAtTheEndOfCircularLinkedList(Node head , int x) {
		Node temp = head;
		if(head == null) {
			head = new Node(x);
			head.next = head;
			return head;
		}
		while(temp.next != head) {
			temp = temp.next;
		}
		temp.next = new Node(x);
		temp.next.next = head;
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
		head = insertAtTheEndOfCircularLinkedList(head , 5);
		CircularLinkedListTraversalInJava.circularLinkedListTraversalInJava(head);
	}

}
