
public class InsertAtBeginOfSinglyLinkedList {

	public static Node insertAtBeginOfSinglyLinkedList(Node head , int x) {
		Node temp = head;
		head = new Node(x);
		head.next = temp;
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		head.next = second;
		second.next = third;
		head = insertAtBeginOfSinglyLinkedList(null, 5);
		TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
