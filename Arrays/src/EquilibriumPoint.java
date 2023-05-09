import java.util.Iterator;

public class EquilibriumPoint {

	public static boolean isEquilibriumPoint(int[] arr) {
		boolean isPresent = false;
		int sum = 0;
		int reverseSum = 0;
		int[] forwardArr = new int[arr.length];
		int[] reverseArr = new int[arr.length]; 
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
			forwardArr[i] = sum;
		}
		for(int i = arr.length - 1 ; i >= 0 ; i--) {
			reverseSum += arr[i];
			reverseArr[i] = reverseSum;
		}
		for(int i = 0 ; i < arr.length ; i++) {
			if(forwardArr[i] == reverseArr[i]) {
				return true;
			}
		}
		return isPresent;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = isEquilibriumPoint(new int[] {4,2,2});
		System.out.println(x);
	}

}
