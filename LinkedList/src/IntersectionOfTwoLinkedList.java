public class IntersectionOfTwoLinkedList {

	public static int intersectionOfTwoLinkedList(Node head , Node head1) {
		Node temp = head;
		Node temp1 = head1;
		int count = 1;
		int count1 = 1;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		temp = head;
		while(temp1 != null) {
			count1++;
			temp1 = temp1.next;
		}
		temp1 = head1;
		//System.out.println(count + " " + count1);
		if(count > count1) {
			while(count != count1) {
				temp = temp.next;
				count--;
			}
		}else {
			while(count1 != count) {
				temp1 = temp1.next;
				count1--;
			}
		}
		while(temp != null && temp1 != null) {
			if(temp == temp1) {
				return temp.val;
			}
			temp = temp.next;
			temp1 = temp1.next;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(45);
		Node fifth = new Node(30);
		Node six = new Node(45);
		head.next = second;
		second.next = third;
		fourth.next = second;
		fifth.next = head;
		six.next = fifth;
		int x = intersectionOfTwoLinkedList(six , fourth);
		System.out.println(x);
		//TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
