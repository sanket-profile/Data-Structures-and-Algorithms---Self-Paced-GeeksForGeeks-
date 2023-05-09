


public class RecursiveTraversalOfSinglyLinkedList {

	public static void recursiveTraversalOfSinglyLinkedList(Node head) {
		if(head == null) {
			return;
		}
		System.out.println(head.val);
		recursiveTraversalOfSinglyLinkedList(head.next);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		head.next = second;
		second.next = third;
		recursiveTraversalOfSinglyLinkedList(head);
	}

}
