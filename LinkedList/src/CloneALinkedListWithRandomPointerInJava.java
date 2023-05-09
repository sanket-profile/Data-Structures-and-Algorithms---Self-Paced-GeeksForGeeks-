class NodeRandom{
	int val;
	NodeRandom next;
	NodeRandom random;
	public NodeRandom(int x) {
		this.val = x;
		this.next = null;
		this.random = null;
	}
}

public class CloneALinkedListWithRandomPointerInJava {

	public static void traversingALinkedListInJava(NodeRandom head) {
		NodeRandom temp = head;
		while(temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
	
	public static NodeRandom cloneALinkedListWithRandomPointerInJava(NodeRandom head) {
		NodeRandom temp = head;
		NodeRandom temp1 = null;
		NodeRandom newHead = null;
		while(temp != null) {
			NodeRandom duplicate = new NodeRandom(temp.val);
			duplicate.next = temp.next;
			temp.next = duplicate;
			temp = temp.next.next;
		}
		temp = head;
		temp1 = temp.next;
		while(temp1.next != null) {
			temp1.random = temp.random;
			temp1 = temp1.next.next;
			temp = temp.next.next;
		}
		temp1.random = temp.random;
		temp = head;
		temp1 = temp.next;
		newHead = temp1;
		while(temp1 != null) {
			temp.next = temp.next;
			temp1.next = temp1.next.next;
			if(temp1.next == null) {
				break;
			}
			temp = temp.next.next;
			temp1 = temp1.next.next;
		}
		head = head.next;
		//System.out.println(temp.val); 10 10 20 20 30 30
		return newHead;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeRandom head = new NodeRandom(10);
		NodeRandom second = new NodeRandom(20);
		NodeRandom third = new NodeRandom(30);
		head.next = second;
		second.next = third;
		head = cloneALinkedListWithRandomPointerInJava(head);
		traversingALinkedListInJava(head);
	}

}
