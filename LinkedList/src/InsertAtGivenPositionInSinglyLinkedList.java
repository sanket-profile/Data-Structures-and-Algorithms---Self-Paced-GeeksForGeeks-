
public class InsertAtGivenPositionInSinglyLinkedList {

	public static Node insertAtGivenPositionInSinglyLinkedList(Node head , int position , int val) {
		Node temp = head;
		Node temp2 = null;
		if(head == null) {
			if(position == 1) {
				head = new Node(val);
			}
			return head;
		}
		if(position == 1) {
			head = new Node(val);
			head.next = temp;
			return head;
		}
		for(int i = 1 ; i < position-1 ; i++) {
			if(temp.next == null && i < position -1) {
				return head;
			}else {
				temp = temp.next;
			}
		}
		temp2 = temp.next;
		temp.next = new Node(val);
		temp.next.next = temp2;
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		//Node third = new Node(30);
		head.next = second;
		//second.next = third;
		head = insertAtGivenPositionInSinglyLinkedList(head, 3, 4);
		TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
