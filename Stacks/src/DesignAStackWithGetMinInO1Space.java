class StackWithGetMin1{
	int size;
	int capacity;
	int min;
	int[] arr;
	public StackWithGetMin1(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		size = 0;
		min = 0;
	}
	public void push(int x) {
		if(size == capacity) {
			System.out.println("Not enough space");
		}else {
			if(size == 0) {
				min = x;
				arr[size] = x;
				size++;
			}else if(x <= min) {
				arr[size] = (2*x) - min;
				min = x;
				size++;
			}else {
				arr[size] = x;
				size++;
			}
		}
	}
	public int pop() {
		if(size == 0) {
			return -1;
		}else {
			if(arr[size-1] <= min) {
				int x = min;
				min = (2*min) - arr[size-1];
				size--;
				return x;
			}else {
				int x = arr[size-1];
				size--;
				return x;
			}
		}
	}
	public int peek() {
		if(size == 0) {
			return -1;
		}else {
			int x = arr[size-1];
			return (x <= min) ? min : x;
		}
	}
	public int getMin() {
		return min;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return (size==0);
	}
}
public class DesignAStackWithGetMinInO1Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWithGetMin1 stack = new StackWithGetMin1(6);
		stack.push(5);
		stack.push(10);
		stack.push(20);
		stack.push(2);
		stack.push(6);
		stack.push(4);
		System.out.println(stack.getMin());
		System.out.println(stack.pop());
		System.out.println(stack.getMin());
		System.out.println(stack.pop());
		System.out.println(stack.getMin());
		stack.push(2);
		System.out.println(stack.getMin());
		System.out.println(stack.pop());
		System.out.println(stack.getMin());
		stack.push(1);
		System.out.println(stack.getMin());
		System.out.println(stack.pop());
		System.out.println(stack.getMin());
		System.out.println(stack.pop());
		System.out.println(stack.getMin());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.getMin());
	}

}
