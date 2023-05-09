
public class SearchInALinkedListIterativeAndRecursive {

	public static int searchInALinkedListIterative(Node head , int key) {
		int count = 0;
		Node temp = head;
		while(temp != null) {
			count ++;
			if(temp.val == key) {
				return count;
			}
			temp = temp.next;
		}
		count = -1;
		return count;
	}
	
	public static int searchInALinkedListRecursive(Node head , int key , int count) {
		if(head == null) {
			return -1;
		}
		if(head.val == key) {
			return count;
		}else {
			return searchInALinkedListRecursive(head.next, key, count+1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		head.next = second;
		second.next = third;
		int x = searchInALinkedListIterative(null,50);
		System.out.println(x);
		//TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
