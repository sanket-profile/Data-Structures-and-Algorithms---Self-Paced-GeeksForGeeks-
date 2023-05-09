import java.util.ArrayDeque;
import java.util.Deque;

class MyCustomDeque{
	Deque<Integer> d;
	public MyCustomDeque() {
		d = new ArrayDeque<>();
	}
	public void insertMin(int x) {
		if(d.size() == 0) {
			d.offerFirst(x);
		}else {
			if(x < d.peekFirst()) {
				d.offerFirst(x);
			}
		}
	}
	public void insertMax(int x) {
		if(d.size() == 0) {
			d.offerLast(x);
		}else {
			if(x > d.peekLast()) {
				d.offerLast(x);
			}
		}
	}
	public int getMin() {
		if(d.size() == 0) {
			return -1;
		}else {
			return d.peekFirst();
		}
	}
	public int getMax() {
		if(d.size() == 0) {
			return -1;
		}else {
			return d.peekLast();
		}
	}
	public int extractMin() {
		if(d.size() == 0) {
			return -1;
		}else {
			return d.pollFirst();
		}
	}
	public int extractMax() {
		if(d.size() == 0) {
			return -1;
		}else {
			return d.pollLast();
		}
	}
}
public class DesignADataStructureWithMinAndMaxOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCustomDeque deque = new MyCustomDeque();
		deque.insertMin(5);
		deque.insertMax(10);
		deque.insertMin(3);
		deque.insertMax(15);
		deque.insertMin(2);
		System.out.println(deque.getMin());
		System.out.println(deque.getMax());
		deque.insertMin(1);
		System.out.println(deque.getMin());
		deque.insertMax(20);
		System.out.println(deque.getMax());
	}

}
