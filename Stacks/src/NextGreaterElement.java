import java.util.ArrayDeque;
import java.util.Arrays;

public class NextGreaterElement {

	public static int[] nextGreaterElement(int[] arr) {
		int[] nextGreater = new int[arr.length];
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(arr[arr.length-1]);
		nextGreater[arr.length-1] = -1;
		for(int i = arr.length - 2 ; i >= 0 ; i--) {
			while(stack.isEmpty() == false && stack.peek() < arr[i]) {
				stack.pop();
			}
			nextGreater[i] = stack.isEmpty() ? -1 : stack.peek();
			stack.push(arr[i]);
		}
		return nextGreater;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = nextGreaterElement(new int[] {5,15,10,8,6,12,9,18});
		System.out.println(Arrays.toString(x));
	}

}
