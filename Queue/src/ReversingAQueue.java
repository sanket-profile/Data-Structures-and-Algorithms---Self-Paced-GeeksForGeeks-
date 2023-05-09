import java.util.ArrayDeque;

public class ReversingAQueue {

	public static ArrayDeque<Integer> reversingAQueue(ArrayDeque<Integer> q) {
		ArrayDeque<Integer> reversedQueue = new ArrayDeque<>();
		while(q.isEmpty() == false) {
			reversedQueue.push(q.pop());
		}
		while(reversedQueue.isEmpty() == false) {
			q.offer(reversedQueue.pop());
		}
		return q;
	}
	public static void recursiveReversingAQueue(ArrayDeque<Integer> q) {
		if(q.isEmpty()) {
			return ;
		}
		int x = q.pop();
		recursiveReversingAQueue(q);
		q.offer(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> a = new ArrayDeque<>();
		a.offer(10);
		a.offer(20);
		a.offer(30);
		a.offer(40);
		recursiveReversingAQueue(a);
		System.out.println(a);
	}

}
