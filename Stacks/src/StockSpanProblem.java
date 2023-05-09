import java.util.ArrayDeque;
import java.util.Arrays;

public class StockSpanProblem {

	public static int[] stockSpanProblem(int[] arr) {
		int[] span = new int[arr.length];
		span[0] = 1;
		for(int i = 1 ; i < arr.length ; i++) {
			int j = i - 1;
			int count = 1;
			while(j >= 0) {
				if(arr[i] > arr[j]) {
					count += span[j];
					j -= span[j];
				}else {
					break;
				}
			}
			span[i] = count;
		}
		return span;
	}
	
	public static int[] stockSpanProblemFast(int[] arr) {
		int[] span = new int[arr.length];
		span[0] = 1;
		int count = 1;
		int maximum = arr[0];
		int maxCount = 1;
		int oneCount = 0;
		for(int i = 1 ; i < arr.length ; i++) {
			count = 1;
			if(arr[i] >= arr[i-1]) {
				if(arr[i] == 29) {
					System.out.println(maximum +" djdnfkd");
				}
				if(arr[i] > maximum) {
					if(arr[i] == 29) {
						System.out.println(maxCount +" djdnfkd");
					}
					count += maxCount;
					if(maximum != arr[i-1]) {
						count += span[i-1];
					}
					span[i] = count;
					maxCount = span[i];
					maximum = arr[i];
					maxCount = Math.max(maxCount, span[i]);
				}else {
					count += span[i-1];
					span[i] = count;
					maxCount = Math.max(maxCount, span[i]);
				}
				if(oneCount > 1) {
					span[i] = span[i] + oneCount;
					maxCount = Math.max(maxCount, span[i]);
					if(maximum == arr[i]) {
						maxCount = span[i];
						maxCount = Math.max(maxCount, span[i]);
					}
					//System.out.println(oneCount);
					oneCount = 0;
				}
			}else {
				span[i] = 1;
				if(span[i-1] == 1) {
					oneCount++;
				}
			}
			if(arr[i] == 18) {
				//System.out.println(oneCount);
			}
		}
		return span;
	}
	
	public static void stockSpanProblemFastest(int[] arr) {
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		System.out.println(1);
		stack.push(0);
		int span = 0;
		for(int i = 1 ; i < arr.length ; i++) {
			while(stack.isEmpty() == false && arr[stack.peek()] <= arr[i]) {
				stack.pop();
			}
			span = stack.isEmpty() ? i+1 : i - stack.peek();
			System.out.println(span);
			stack.push(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stockSpanProblemFastest(new int[] {18,12,13,14,11,16});
	}

}
