
public class DetectLoopUsingFloydCycleDetection {

	public static boolean hasCycle(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		head.next = second;
		second.next = third;
		third.next = second;
		boolean x = hasCycle(head);
		System.out.println(x);
		//TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
