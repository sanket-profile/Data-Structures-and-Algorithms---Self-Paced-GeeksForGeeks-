import java.util.Arrays;

public class MinimumDifferenceInAnArray {

	public static int minimumDifferenceInAnArray(int[] arr) {
		int minimum = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[i] - arr[i-1] < minimum) {
				minimum = arr[i] - arr[i-1];
			}
		}
		return minimum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = minimumDifferenceInAnArray(new int[] {1,8,12,5,18});
		System.out.println(x);
	}

}
