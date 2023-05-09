class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
class MyQueueLinkedList{
	Node front;
	Node rear;
	int size;
	public MyQueueLinkedList() {
		front = null;
		rear = null;
		size = 0;
	}
	public void enqueue(int x) {
		if(size == 0) {
			front = new Node(x);
			rear = front;
			size++;
		}else {
			rear.next = new Node(x);
			rear = rear.next;
			size++;
		}
	}
	public int dequeue() {
		if(size == 0) {
			return -1;
		}else {
			int x = front.data;
			front = front.next;
			size--;
			return x;
		}
	}
	public int size() {
		return size;
	}
	public int getfront() {
		return front.data;
	}
	public int getrear() {
		return rear.data;
	}
	public boolean isEmpty() {
		return (size == 0);
	}
}
public class ImplementationOfQueueUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueueLinkedList queue = new MyQueueLinkedList();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		System.out.println(queue.dequeue());
		System.out.println(queue.getfront());
		System.out.println(queue.getrear());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		queue.enqueue(40);
		System.out.println(queue.getfront());
		System.out.println(queue.getrear());
	}

}
