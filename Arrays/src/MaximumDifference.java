
public class MaximumDifference {

	public static int maximumDifference(int[] arr) {
		int difference = arr[1] - arr[0];
		int minValue = arr[0];
		for(int i = 2 ; i < arr.length ; i++) {;
			if(difference < arr[i]-minValue) {
				difference = arr[i]-minValue;
			}
			if(arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		return difference;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = maximumDifference(new int [] {2,3,10,6,1,20,4,8,1 });
		System.out.println(x);
	}

}
