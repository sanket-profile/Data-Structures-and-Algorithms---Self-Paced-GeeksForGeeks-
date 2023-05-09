
public class SegregateEvenAndOddNodesInJava {

	public static Node segregateEvenAndOddNodesInJava(Node head) {
		Node temp = head;
		Node temp1 = head;
		int tempInt = 0;
		while(temp != null) {
			if(temp.val % 2 == 0) {
				tempInt = temp.val;
				temp.val = temp1.val;
				temp1.val = tempInt;
				temp = temp.next;
				temp1 = temp1.next;
			}else {
				temp = temp.next;
			}
		}
		return head;
	}
	
	public static Node segregateEvenAndOddNodesInJavaInOrder(Node head) {
		Node temp = head;
		Node evenEnd = null;
		Node oddEnd = null;
		Node holder = null;
		while(temp != null) {
			if(temp.val % 2 == 0) {
				if(evenEnd == null && oddEnd == null) {
					evenEnd = temp;
					temp = temp.next;
				}else if(evenEnd == null && oddEnd != null){
					holder = temp;
					oddEnd.next = temp.next;
					holder.next = head;
					head = holder;
					evenEnd = head;
					System.out.println("sdfjkahdfa");
					temp = oddEnd.next;
				}else {
					if(oddEnd == null) {
						evenEnd = evenEnd.next;
						temp = temp.next;
					}else {
						holder = temp;
						oddEnd.next = temp.next;
						holder.next = evenEnd.next;
						evenEnd.next = holder;
						evenEnd = evenEnd.next;
						temp = oddEnd.next;
					}
				}
			}else {
				oddEnd = temp;
				temp = temp.next;
			}
		}
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub  17 15 8 9 2 4 6
		Node head = new Node(10);
		Node second = new Node(15);
		Node third = new Node(8);
		Node fourth = new Node(9);
		Node fifth = new Node(2);
		Node six = new Node(4);
		Node seventh = new Node(6);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = six;
		six.next = seventh;
		head = segregateEvenAndOddNodesInJavaInOrder(head);
		TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
