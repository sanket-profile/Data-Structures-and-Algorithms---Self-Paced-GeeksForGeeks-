
public class SlidingWindowTechnique {

	public static int maxKSumSubarray(int[] arr , int k) {
		int sum = 0;
		int maxSum = 0;
		int i = 0;
		while(i < arr.length) {
			if(i < k) {
				sum += arr[i];
				maxSum = Math.max(maxSum, sum);
				i++;
			}else {
				sum += (arr[i] - arr[i - k]);
				maxSum = Math.max(maxSum, sum);
				i++;
			}
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = maxKSumSubarray(new int[] {5,-10,6,90,3}, 2);
		System.out.println(x);
	}

}
