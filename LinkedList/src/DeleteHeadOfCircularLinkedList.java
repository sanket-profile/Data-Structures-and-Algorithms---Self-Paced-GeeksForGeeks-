
public class DeleteHeadOfCircularLinkedList {

	public static Node deleteHeadOfCircularLinkedList(Node head) {
		Node temp = head;
		if(head == null || head.next == head) {
			return null;
		}
		while(temp.next != head) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		return temp.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		head.next = second;
		second.next = third;
		third.next = head;
		head = deleteHeadOfCircularLinkedList(head);
		CircularLinkedListTraversalInJava.circularLinkedListTraversalInJava(head);
	}

}
