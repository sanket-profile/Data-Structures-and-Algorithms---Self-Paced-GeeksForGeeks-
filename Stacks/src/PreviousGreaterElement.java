import java.util.ArrayDeque;
import java.util.Arrays;

public class PreviousGreaterElement {

	public static int[] previousGreaterElement(int[] arr) {
		int[] prevGreater = new int[arr.length];
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(arr[0]);
		prevGreater[0] = -1;
		for(int i = 1 ; i < arr.length ; i++) {
			while(stack.isEmpty() == false && stack.peek() < arr[i]) {
				stack.pop();
			}
			prevGreater[i] = stack.isEmpty() ? -1 : stack.peek();
			stack.push(arr[i]);
		}
		return prevGreater;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = previousGreaterElement(new int[] {12,10,8});
		System.out.println(Arrays.toString(x));
	}

}
