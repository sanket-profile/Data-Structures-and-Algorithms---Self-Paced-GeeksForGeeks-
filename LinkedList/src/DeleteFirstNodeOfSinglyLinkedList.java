
public class DeleteFirstNodeOfSinglyLinkedList {

	public static Node deleteFirstNodeOfSinglyLinkedList(Node head) {
		if(head == null) {
			return null;
		}
		return head.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		head.next = second;
		second.next = third;
		head = deleteFirstNodeOfSinglyLinkedList(head);
		TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
