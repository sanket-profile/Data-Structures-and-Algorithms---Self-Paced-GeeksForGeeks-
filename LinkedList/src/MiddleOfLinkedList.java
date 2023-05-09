
public class MiddleOfLinkedList {

	public static void middleOfLinkedList(Node head) {
		int count = 1;
		Node temp = head;
		if(head == null) {
			return;
		}
		while(temp.next != null) {
			temp = temp.next;
			count++;
		}
		count = count /2;
		temp = head;
		while(count != 0) {
			temp = temp.next;
			count--;
		}
		System.out.println(temp.val);
	}
	
	public static void middleOfLinkedListFast(Node head) {
		Node slow = head;
		Node fast = head;
		boolean flag = false;
		if(head == null) {
			return;
		}
		while(fast.next != null ) {
			if(fast.next.next == null) {
				flag = true;
				break;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		if(flag) {
			System.out.println(slow.next.val);
		}else {
			System.out.println(slow.val);
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
		middleOfLinkedListFast(null);
	}

}
