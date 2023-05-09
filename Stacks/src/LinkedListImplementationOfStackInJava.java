
class Node{
	int val;
	Node next;
	Node(int x){
		this.val = x;
		this.next = null;
	}
}

class MyStackLinkedList{
	int size;
	Node head;
	Node temp = head;
	
	public void push(int x) {
		if(head == null) {
			head = new Node(x);
			temp = head;
			size++;
		}else {
			Node head = new Node(x);
			head.next = temp;
			temp = head;
			size++;
		}
	}
	
	public int peek() {
		if(size == 0) {
			return -1;
		}else {
			return temp.val;
		}
	}
	
	public int pop() {
		if(size == 0) {
			return -1;
		}else {
			int x = temp.val;
			head = head.next;
			temp = head;
			size--;
			return x;
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
}

public class LinkedListImplementationOfStackInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStackLinkedList m = new MyStackLinkedList();
		m.push(5);
		m.push(15);
		m.push(25);
		System.out.println(m.peek());
		System.out.println(m.pop());
		m.push(35);
		System.out.println(m.size());
		System.out.println(m.isEmpty());
	}

}
