
public class DeleteKthOfACircularLinkedList {

	public static Node deleteKthOfACircularLinkedList(Node head , int k) {
		Node temp = head;
		boolean flag = false;
		if(head == null) {
			return null;
		}
		if(k == 1 && head.next == head) {
			return null;
		}
		if(k == 1 && head.next != null) {
			temp.val = temp.next.val;
			temp.next = temp.next.next;
			return head;
		}
		for(int i = 1 ; i < k-1 ; i++) {
			if(temp.next.next == head && i < k-1) {
				flag = true;
				break;
			}
			temp = temp.next;
		}
		if(flag == true) {
			return head;
		}else {
			temp.next = temp.next.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		head.next = second;
		second.next = third;
		third.next = head;
		head = deleteKthOfACircularLinkedList(head , 1);
		CircularLinkedListTraversalInJava.circularLinkedListTraversalInJava(head);
	}

}
