import java.util.ArrayDeque;
import java.util.Arrays;

public class LargestRectangularAreaInAHistogramPart1 {

	public static int largestRectangularAreaInAHistogramPart1(int[] arr) {
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		int maxArea = 0;
		int area = 0;
		int posiHolder = 0;
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		boolean flag = false;
		for(int i = 0 ; i < arr.length ; i++) {
			while(stack.isEmpty() == false && arr[stack.peek()] >= arr[i]) {
				posiHolder = stack.pop();
				flag = true;
			}
			posiHolder = stack.isEmpty() ? 0 : stack.peek()+1;
			if(arr[i] != i-posiHolder+1) {
				if(flag == false) {
					posiHolder = i;
				}
				area = arr[i] * (i-posiHolder+1);
				left[i] = area;
				maxArea = Math.max(area, maxArea);
			}else {
				left[i] = arr[i];
			}
			flag = false;
			stack.push(i);
		}
		stack.clear();
		flag = false;
		//System.out.println(Arrays.toString(left));
		for(int i = arr.length-1 ; i >= 0 ; i--) {
			while(stack.isEmpty() == false && arr[stack.peek()] >= arr[i]) {
				posiHolder = stack.pop();
				flag = true;
			}
			posiHolder = stack.isEmpty() ? arr.length - 1 : stack.peek()-1;
			if(arr[i] != posiHolder-i+1) {
				if(flag == false) {
					posiHolder = i;
				}
				area = arr[i] * (posiHolder-i+1);
				right[i] = area;
				maxArea = Math.max(area, maxArea);
			}else {
				right[i] = arr[i];
			}
			flag = false;
			stack.push(i);
		}
		//System.out.println(Arrays.toString(right));
		for(int i = 0 ; i < arr.length ; i++) {
			area = left[i] + right[i] - arr[i];
			maxArea = Math.max(area, maxArea);
		}
		return maxArea;
	}
	
	public static int largestRectangularAreaInAHistogramPart2Fastest(int[] arr) {
		int maxArea = 0;
		int area = 0;
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		int pop = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			while(stack.isEmpty() == false && arr[stack.peek()] >= arr[i]) {
				pop = stack.pop();
				area = arr[pop] * (stack.isEmpty() ? i : (i - stack.peek() - 1));
				maxArea = Math.max(area, maxArea);
			}
			stack.push(i);
		}
		while(stack.isEmpty() == false) {
			pop = stack.pop();
			area = arr[pop] * (stack.isEmpty() ? arr.length : (arr.length - stack.peek() - 1));
			maxArea = Math.max(area, maxArea);
		}
		return maxArea;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = largestRectangularAreaInAHistogramPart1(new int[] {2,1,2});
		System.out.println(x);
	}

}
