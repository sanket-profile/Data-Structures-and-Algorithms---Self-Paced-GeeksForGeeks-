
public class MaximumSubArraySum {

	public static int maxSum(int[] arr) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length ; i++) {
			sum = sum + arr[i];
			if(sum > maxSum) {
				maxSum = sum;
			}
			if(sum < 0) {
				sum = 0;
			}
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = maxSum(new int[] {-3,8,-2,4,-5,6});
		System.out.println(x);
	}

}
