
public class PairwiseSwapNodesOfLinkedListInJava {

	public static Node pairwiseSwapNodesOfLinkedListInJava(Node head) {
		Node temp = head;
		int tempInt = 0;
		while(temp != null && temp.next != null) {
			tempInt = temp.val;
			temp.val = temp.next.val;
			temp.next.val = tempInt;
			temp = temp.next.next;
		}
		return head;
	}
	
	public static Node pairwiseSwapNodesOfLinkedListInJavaBetter(Node head) {
		Node prev = head;
		Node temp = head.next;
		Node next = null;
		Node last = head;
		boolean flag = true;
		while(temp != null && temp.next != null) {
			next = temp.next;
			temp.next = prev;
			prev.next = next;
			if(flag) {
				head = temp;
			}
			prev = next;
			if(flag == false) {
				last.next = temp;
				last = last.next.next;
			}
			temp = next.next;
			flag = false;
		}
		if(temp.next == null) {
			temp.next = prev;
			prev.next = null;
			last.next = temp;
		}
		return head;
	}
	
	public static Node pairwiseSwapNodesOfLinkedListInJavaFaster(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node temp = head.next.next;
		Node prev = head;
		head = head.next;
		head.next = prev;
		while(temp != null && temp.next != null) {
			prev.next = temp.next;
			prev = temp;
			Node next = temp.next.next;
			temp.next.next = temp;
			temp = next;
		}
		prev.next = temp;
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub  1 2 2 4 5 6 7 8
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node six = new Node(6);
		Node seven = new Node(7);
		Node eight = new Node(8);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = six;
		six.next =seven;
		seven.next = eight;
		head = pairwiseSwapNodesOfLinkedListInJavaFaster(head);
		TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
