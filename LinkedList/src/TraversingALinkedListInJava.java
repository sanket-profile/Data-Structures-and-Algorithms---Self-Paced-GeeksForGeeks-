
class Node{
	int val;
	Node next;
	Node(int x){
		this.val = x;
		this.next = null;
	}
}

public class TraversingALinkedListInJava {

	public static void traversingALinkedListInJava(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		head.next = second;
		second.next = third;
		traversingALinkedListInJava(head);
	}

}
