class Myqueue{
	int size;
	int capacity;
	int front;
	int rear;
	int[] arr;
	public Myqueue(int capacity) {
		arr = new int[capacity];
		this.capacity = capacity;
		size = 0;
		front = 0;
		rear = 0;
	}
	public void enqueue(int x) {
		if(size == capacity) {
			System.out.println("Queue is full");
		}else {
			if(rear == capacity && front != 0) {
				rear = 0;
				arr[rear] = x;
				rear++;
				size++;
			}else {
				if(rear+1 != front) {
					arr[rear] = x;
					rear++;
					size++;
					}
				}
			}
		}
	public int dequeue() {
		if(size == 0) {
			return -1;
		}else {
			if(front == capacity) {
				front = 0;
				int x = arr[front];
				front++;
				size--;
				return x;
			}else {
			int x = arr[front];
			front++;
			size--;
			return x;
			}
		}
	}
	public int getfront() {
		return (size == 0) ? -1 : arr[front];
	}
	public int getrear() {
		return (size == 0) ? -1 : arr[rear-1];
	}
	public int size() {
		return size;
	}
	public boolean isFull() {
		return (size == capacity);
	}
	public boolean isEmpty() {
		return (! isFull());
	}
}
public class ImplementationOfQueueUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myqueue queue = new Myqueue(4);
		queue.enqueue(10);
		queue.enqueue(20);
		System.out.println(queue.getfront());
		System.out.println(queue.getrear());
		queue.enqueue(30);
		queue.enqueue(40);
		System.out.println(queue.dequeue());
		queue.enqueue(50);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.size());
		System.out.println(queue.isFull());
	}

}
