
public class ReverseALinkedListInGroupsOfSizeK {

	public static Node reverseALinkedListInGroupsOfSizeK(Node head , int k) {
		Node temp = head;
		Node prev = null;
		Node next = null;
		int count = 0;
		while(temp != null && count < k) {
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
			count++;
		}
		if(next != null) {
			Node recHead = reverseALinkedListInGroupsOfSizeK(next, k);
			head.next = recHead;
		}
		return prev;
	}
	
	public static Node reverseALinkedListInGroupsOfSizeKIterative(Node head , int k) {
		Node temp = head;
		Node prevFirst = null;
		boolean isFirstPass = true;
		while(temp != null) {
			Node prev = null;
			Node first = temp;
			int count = 0;
			while(temp != null && count < k) {
				Node next = temp.next;
				temp.next = prev;
				prev = temp;
				temp = next;
				count++;
			}
			if(isFirstPass) {
				head = prev;
				isFirstPass = false;
			}else {
				prevFirst.next = prev;
			}
			prevFirst = first;
		}
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth = new Node(50);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		head = reverseALinkedListInGroupsOfSizeKIterative(head,3);
		TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
