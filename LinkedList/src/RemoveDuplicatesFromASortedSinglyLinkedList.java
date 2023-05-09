
public class RemoveDuplicatesFromASortedSinglyLinkedList {

	public static Node removeDuplicatesFromASortedSinglyLinkedList(Node head) {
		Node temp = head;
		Node temp1 = head;
		boolean flag = false;
		int tempInt = 0;
		Node dups = head;
		if(head == null) {
			return head;
		}
		while(temp.next != null) {
			if(temp.val != temp.next.val) {
				if(flag == true) {
					temp1 = temp1.next;
				}
				tempInt = temp.val;
				temp.val = dups.val;
				dups.val = tempInt;
				temp = temp.next;
				dups = dups.next;
				flag = true;
			}else {
				if(flag == true) {
					temp1 = temp1.next;
				}
				flag = true;
				temp = temp.next;
			}
		}
		if(dups == temp) {
			return head;
		}else if(temp1.val == temp.val) {
			tempInt = temp.val;
			temp.val = dups.val;
			dups.val = tempInt;
			dups.next = null;
			return head;
		}else {
			tempInt = temp1.val;
			temp1.val = dups.val;
			dups.val = tempInt;
			dups = dups.next;
			dups.val = temp.val;
			dups.next = null;
			return head;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(10);
		Node third = new Node(10);
		Node fourth = new Node(10);
		Node fifth = new Node(10);
		Node six = new Node(10);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = six;
		head = removeDuplicatesFromASortedSinglyLinkedList(head);
		TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
