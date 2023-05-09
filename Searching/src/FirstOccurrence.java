
public class FirstOccurrence {

	public static int firstOccurrence(int[] arr , int k) {
		int fOccurrence = -1;
		int low = 0;
		int high = arr.length;
		int mid= 0;
		while(low <= high) {
			mid = (low + high)/2;
			if(arr[mid] == k) {
				fOccurrence = mid;
				high = mid-1;
			}else if(arr[mid] > k) {
				high = mid -1;
			}else {
				low = mid+1;
			}
		}
		return fOccurrence;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = firstOccurrence(new int[] {15,15,15}, 15);
		System.out.println(x);
	}

}
