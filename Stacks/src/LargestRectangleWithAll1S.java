import java.util.ArrayDeque;
import java.util.Arrays;

public class LargestRectangleWithAll1S {
	
	public static int maximumArea(int[] arr) {
		int area = 0;
		int maxArea = 0;
		int posiHolder = 0;
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		for(int i = 0 ; i < arr.length ; i++) {
			while(stack.isEmpty() == false && arr[stack.peek()] >= arr[i]) {
				stack.pop();
			}
			posiHolder = stack.isEmpty() ? 0 : stack.peek()+1;
			area = arr[i] * (i-posiHolder+1);
			left[i] = area;
			maxArea = Math.max(maxArea, area);
			stack.push(i);
		}
		stack.clear();
		for(int i = arr.length - 1 ; i >= 0 ; i--) {
			while(stack.isEmpty() == false && arr[stack.peek()] >= arr[i]) {
				stack.pop();
			}
			posiHolder = stack.isEmpty() ? arr.length - 1 : stack.peek()-1;
			area = arr[i] * (posiHolder-i+1);
			right[i] = area;
			maxArea = Math.max(maxArea, area);
			stack.push(i);
		}
		for(int i = 0 ; i < arr.length ; i++) {
			area = left[i] + right[i] - arr[i];
			maxArea = Math.max(area, maxArea);
		}
		return maxArea;
	}

	public static int largestRectangleWithAll1S(int[][] arr) {
		int area = 0;
		int maxArea = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[0].length ; j++) {
				if(i == 0) {
					break;
				}
				if(arr[i][j] != 0) {
					arr[i][j] += arr[i-1][j];
				} 
			}
			area = maximumArea(arr[i]);
			maxArea = Math.max(maxArea, area);
		}
		return maxArea;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = largestRectangleWithAll1S(new int[][] {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}});
		System.out.println(x);
	}

}
