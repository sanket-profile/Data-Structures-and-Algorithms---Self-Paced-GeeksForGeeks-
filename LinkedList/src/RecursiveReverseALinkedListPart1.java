
public class RecursiveReverseALinkedListPart1 {

	public static Node recursiveReverseALinkedListPart1(Node head , Node previous , Node next) {
		if(head == null) {
			return previous;
		}
		next = head.next;
		head.next = previous;
		previous = head;
		return recursiveReverseALinkedListPart1(next, previous, next);
	}
	
	public static Node recursiveReverseALinkedListPart1WithoutParameters(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node recHead = recursiveReverseALinkedListPart1WithoutParameters(head.next);
		Node recTail = head.next;
		recTail.next = head;
		head.next = null;
		return recHead;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		head.next = second;
		second.next = third;
		head = recursiveReverseALinkedListPart1WithoutParameters(head);
		TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
