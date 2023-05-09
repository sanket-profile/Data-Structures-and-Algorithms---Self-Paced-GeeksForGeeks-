
public class SortedInsertInASinglyLinkedList {

	public static Node sortedInsertInASinglyLinkedList(Node head , int x) {
		boolean flag = false;
		int count = 1;
		Node temp = head;
		Node temp1 = head;
		if(head == null) {
			return new Node(x);
		}
		while(temp.val < x) {
			if(flag == true) {
				temp1 = temp1.next;
			}
			if(temp.next == null) {
				temp.next = new Node(x);
				return head;
			}
			temp = temp.next;
			count++;
			flag = true;
		}
		if(count == 1) {
			head = new Node(x);
			head.next = temp;
			return head;
		}else {
			temp1.next = new Node(x);
			temp1.next.next = temp;
			return head;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		head.next = second;
		second.next = third;
		head = sortedInsertInASinglyLinkedList(head , 15);
		TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
