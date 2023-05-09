
public class DeleteNodeWithOnlyPointerGivenToIt {

	public static Node deleteNodeWithOnlyPointerGivenToIt(Node pos) {
		Node temp = pos;
		Node temp1 = pos;
		int tempInt = 0;
		boolean flag = false;
		while(temp.next != null) {
			if(flag) {
				temp1 = temp1.next;
			}
			temp.val = temp.next.val;
			temp = temp.next;
			flag = true;
		}
		temp1.next = null;
		return pos;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		head.next = second;
		second.next = third;
		Node head1 = deleteNodeWithOnlyPointerGivenToIt(second);
		TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
