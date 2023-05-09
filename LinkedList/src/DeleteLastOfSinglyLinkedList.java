
public class DeleteLastOfSinglyLinkedList {

	public static Node deleteLastOfSinglyLinkedList(Node head) {
		Node temp = head;
		if(head == null || head.next == null) {
			return null;
		}
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		head.next = second;
		second.next = third;
		head = deleteLastOfSinglyLinkedList(third);
		TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
