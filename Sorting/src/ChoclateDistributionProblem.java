import java.util.Arrays;

public class ChoclateDistributionProblem {

	public static int minimumDiffference(int[] arr , int m) {
		int difference = 0;
		int minDifference = Integer.MAX_VALUE;
		Arrays.sort(arr);
		int i = 0;
		while(i != arr.length - m + 1) {
			difference = arr[i+m-1] - arr[i];
			if(difference < minDifference) {
				minDifference = difference;
			}
			i++;
		}
		return minDifference;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = minimumDiffference(new int[] {7,3,2,4,9,12,56}, 3);
		System.out.println(x);
	}

}
