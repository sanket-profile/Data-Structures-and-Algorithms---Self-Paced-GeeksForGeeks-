
public class NthNodeFromEndOfLinkedList {

	public static void nthNodeFromEndOfLinkedList(Node head , int k) {
		Node temp = head;
		int count = 1;
		int pos = 1;
		if(head == null){
			return ;
		}
		while(temp.next != null) {
			count++;
			temp = temp.next;
		}
		if(count < k) {
			return;
		}else {
			temp = head;
			if(count - k == 0) {
				System.out.println(head.val);
			}else {
				while(pos != count - k) {
					temp = temp.next;
					pos++;
				}
				System.out.println(temp.next.val);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		head.next = second;
		second.next = third;
		third.next = fourth;
		nthNodeFromEndOfLinkedList(head , 1);
	}

}
