
public class InsertAtTheEndOfSinglyLinkedList {

	public static Node insertAtTheEndOfSinglyLinkedList(Node head , int x) {
		Node temp = head;
		if(head == null) {
			head = new Node(x);
			return head;
		}
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Node(x);
		
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		head.next = second;
		second.next = third;
		head = insertAtTheEndOfSinglyLinkedList(head, 5);
		TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
