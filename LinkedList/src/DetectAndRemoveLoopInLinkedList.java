
public class DetectAndRemoveLoopInLinkedList {

	public static Node detectAndRemoveLoopInLinkedList(Node head) {
		Node slow = head;
		Node fast = head;
		boolean flag = false;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				slow = head;
				flag = true;
				break;
			}
		}
		if(flag == false) {
			return head;
		}
		while(slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		head.next = second;
		second.next = third;
		head = detectAndRemoveLoopInLinkedList(head);
		TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
