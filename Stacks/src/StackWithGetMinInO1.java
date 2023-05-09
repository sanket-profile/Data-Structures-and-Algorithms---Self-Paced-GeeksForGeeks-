class StackWithGetMin{
	int size;
	int sizeMin;
	int capacity;
	int[] arr;
	int[] min;
	public StackWithGetMin(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		min = new int[capacity];
		size = 0;
		sizeMin = 0;
	}
	public void push(int x) {
		if(size == capacity) {
			System.out.println("Not enough space");
		}else {
			arr[size] = x;
			size++;
			if(sizeMin == 0) {
				min[sizeMin] = x;
				sizeMin++;
			}else if(x < min[sizeMin -1]) {
				min[sizeMin] = x;
				sizeMin++;
			}
		}
	}
	public int pop() {
		if(size == 0) {
			return -1;
		}else {
			int x = arr[size-1];
			size--;
			if(x == min[sizeMin-1]) {
				sizeMin--;
			}
			return x;
		}
	}
	public int peek() {
		if(size == 0) {
			return -1;
		}else {
			return arr[size-1];
		}
	}
	public int getMin() {
		if(size == 0) {
			return -1;
		}else {
			return min[sizeMin-1];
		}
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return (size==0);
	}
}
public class StackWithGetMinInO1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWithGetMin stack = new StackWithGetMin(4);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(2);
		System.out.println(stack.getMin());
		System.out.println(stack.pop());
		System.out.println(stack.getMin());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.getMin());
		System.out.println(stack.peek());
		System.out.println(stack.size);
		System.out.println(stack.isEmpty());
	}

}
