import java.util.Iterator;

public class CountOnes {

	public static int numOnes(int[] arr) {
		int fOccurrence = -1;
		int low = 0;
		int high = arr.length;
		int mid= 0;
		while(low <= high) {
			mid = (low + high)/2;
			if(arr[mid] == 1) {
				if(mid == 0 || arr[mid] != arr[mid-1]) {
					fOccurrence = mid;
					break;
				}else {
					high = mid-1;
				}
			}else if(arr[mid] > 1) {
				high = mid -1;
			}else {
				low = mid+1;
			}
		}
		return arr.length - fOccurrence ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = numOnes(new int[] {1});
		System.out.println(x);
	}

}
