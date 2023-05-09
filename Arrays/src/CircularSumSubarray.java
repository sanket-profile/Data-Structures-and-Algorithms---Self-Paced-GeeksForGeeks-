
public class CircularSumSubarray {

	public static int maxCircularSum(int[] arr) {
		int sum = 0;
		int maxSum = 0;
		int min = 0;
		int maxMin = 0;
		int minIndex = 0;
		int temp = 0;
		int straightsum = 0;
		int maxStraightSum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			min = min + arr[i];
			if(min > 0) {
				min = 0;
			}
			if(min < maxMin) {
				maxMin = min;
				minIndex = i;
			}
		}
		temp = minIndex +1;
		System.out.println(temp);
		while(temp != minIndex) {
			sum += arr[temp];
			if(sum > maxSum) {
				maxSum = sum;
			}
			if(sum < 0) {
				sum = 0;
			}
			temp++;
			if(temp == arr.length) {
				temp = 0;
			}
		}
		if(maxMin == 0) {
			maxSum += arr[0];
		}
		for(int i = 0 ; i < arr.length ; i++) {
			straightsum = straightsum + arr[i];
			if(straightsum < 0) {
				straightsum = 0;
			}
			if(straightsum > maxStraightSum) {
				maxStraightSum = straightsum;
			}
		}
		return Math.max(maxSum, maxStraightSum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = maxCircularSum(new int[] {14,10,23});
		System.out.println(x);
	}

}
