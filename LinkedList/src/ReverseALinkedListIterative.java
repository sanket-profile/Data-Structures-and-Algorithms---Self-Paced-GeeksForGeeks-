
public class ReverseALinkedListIterative {

	public static Node reverseALinkedListIterative(Node head) {
		int count = 1;
		int count1 = 1;
		int temp3 = 0;
		Node temp = head;
		Node temp1 = head;
		if(head == null) {
			return null;
		}
		if(head.next == null) {
			return head;
		}
		while(temp.next != null) {
			count++;
			temp = temp.next;
		}
		temp3 = head.val;
		head.val = temp.val;
		temp.val = temp3;
		temp1 = head.next;
		count1 = count -2;
		for(int i = 1 ; i <= count -2 ; i++) {
			temp = temp1;
			for(int j = 1 ; j <= count1 - i ; j++) {
				temp = temp.next; 
			}
			//System.out.println(temp.val + " djnkjwdhkwd");
			temp3 = temp1.val;
			temp1.val = temp.val;
			temp.val = temp3;
			temp1 = temp1.next;
			count1--;
			//System.out.println(temp1.val + "sndkjshis");
		}
		return head;
	}
	
	public static Node reverseALinkedListIterativeFast(Node head) {
		Node temp = head;
		Node prev = null;
		Node next = temp;
		while(temp != null) {
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
			//System.out.println(next.val);
		}
		return prev;
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
		head = reverseALinkedListIterativeFast(head);
		TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
