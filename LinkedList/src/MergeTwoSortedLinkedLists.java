
public class MergeTwoSortedLinkedLists {

	public static Node mergeTwoSortedLinkedLists(Node head , Node head1) {
		Node temp = head;
		Node holder = null;
		Node prev = head;
		boolean flag = false;
		while(head1 != null) {
			while(head1.val > temp.val) {
				if(flag) {
					prev = prev.next;
					}
				temp = temp.next;
				if(temp == null) {
					prev.next = head1;
					return head;
				}
				flag = true;
			}
			if(temp == head) {
				holder = head1;
				head1 = head1.next;
				head = holder;
				head.next = temp;
				temp = head;
				prev = head;
			}else {
				holder = head1;
				head1 = head1.next;
				prev.next = holder;
				holder.next = temp;
				prev = prev.next;
				System.out.println("djfidshjfckjsnckjdsncksjdnc");
			}
			System.out.println(temp.val + "dhjhsjhcijs");
		}
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 5 10 15 40  2 3 20
		Node head = new Node(5);
		Node second = new Node(10);
		Node third = new Node(15);
		Node fourth = new Node(40);
		head.next = second;
		second.next = third;
		third.next = fourth;
		Node head1 = new Node(1);
		Node second1 = new Node(45);
		Node third1 = new Node(50);
		head1.next = second1;
		second1.next = third1;
		head = mergeTwoSortedLinkedLists(head, head1);
		TraversingALinkedListInJava.traversingALinkedListInJava(head);
	}

}
