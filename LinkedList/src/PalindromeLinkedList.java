
public class PalindromeLinkedList {

	public static Node copyList(Node head) {
	    // Initialize a new list to hold the copy
	    Node newHead = null;
	    Node tail = null;
	    
	    // Iterate through the original list and add a new node with the same data to the new list
	    Node temp = head;
	    while (temp != null) {
	        Node newNode = new Node(temp.val);
	        if (newHead == null) {
	            newHead = newNode;
	            tail = newNode;
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	        temp = temp.next;
	    }
	    
	    // Return the new list
	    return newHead;
	}

	
	public static Node reverseALinkedListIterativeFast(Node head) {
		Node temp = copyList(head);
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
	
	public static boolean palindromeLinkedList(Node head) {
		Node temp = head;
		Node reverse = reverseALinkedListIterativeFast(temp);
		//TraversingALinkedListInJava.traversingALinkedListInJava(head);
		while(temp != null) {
			if(temp.val != reverse.val) {
				return false;
			}
			temp = temp.next;
			reverse = reverse.next;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(5);
		Node second = new Node(1);
		Node third = new Node(7);
		Node four = new Node(3);
		Node five = new Node(5);
		head.next = second;
		second.next = third;
		third.next = four;
		four.next = five;
		boolean x = palindromeLinkedList(head);
		System.out.println(x);
	}

}
