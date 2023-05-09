import java.util.Arrays;

class MyDeque{
	@Override
	public String toString() {
		return "MyDeque [size=" + size + ", capacity=" + capacity + ", arr=" + Arrays.toString(arr) + ", front=" + front
				+ ", rear=" + rear + ", deleteFront()=" + deleteFront() + ", deleteRear()=" + deleteRear()
				+ ", getFront()=" + getFront() + ", getRear()=" + getRear() + ", size()=" + size() + ", isFull()="
				+ isFull() + ", isEmpty()=" + isEmpty() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	int size;
	int capacity;
	int[] arr;
	int front;
	int rear;
	public MyDeque(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		this.size = 0;
		this.front = 0;
		this.rear = 0;
	}
	public void insertFront(int x) {
		if(size == capacity) {
			System.out.println("Deque is full");
		}else {
			front = (front-1+capacity)%capacity;
			arr[front] = x;
			size++;
		}
	}
	public void insertRear(int x) {
		if(size == capacity) {
			System.out.println("Deque is full");
		}else {
			rear = (front + size) % capacity;
			arr[rear] = x;
			size++;
		}
	}
	public int deleteFront() {
		if(size == 0) {
			return -1;
		}else {
			int x = arr[front];
			front = (front + 1)%capacity;
			size--;
			return x;
		}
	}
	public int deleteRear() {
		if(size == 0) {
			return -1;
		}else {
			int x = arr[rear];
			rear = (rear -1 + capacity) % capacity;
			size--;
			return x;
		}
	}
	public int getFront() {
		return (size == 0) ? -1 : arr[front];
	}
	public int getRear() {
		return (size == 0) ? -1 : arr[rear];
	}
	public int size() {
		return size;
	}
	public boolean isFull() {
		return (size == capacity);
	}
	public boolean isEmpty() {
		return (size == 0);
	}
}
public class ArrayImplementationOfDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDeque deque = new MyDeque(4);
		deque.insertFront(10);
		deque.insertRear(20);
		deque.insertFront(30);
		System.out.println(deque.deleteFront());
		System.out.println(deque.deleteRear());
		System.out.println(deque.size());
	}

}
