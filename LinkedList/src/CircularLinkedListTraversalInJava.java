
public class CircularLinkedListTraversalInJava {

	public static void circularLinkedListTraversalInJava(Node head) {
		Node temp = head;
		if(head == null) {
			return ;
		}
		while(temp.next != head) {
			System.out.println(temp.val);
			temp = temp.next;
		}
		System.out.println(temp.val);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		head.next = second;
		second.next = third;
		third.next = head;
		circularLinkedListTraversalInJava(null);
	}

}
