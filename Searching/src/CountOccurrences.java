
public class CountOccurrences {

	public static int countOccurrences(int[] arr , int k) {
		int fOccurrence = -1;
		int lOccurrence = -1;
		int low = 0;
		int high = arr.length-1;
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
		low =0;
		high = arr.length-1;
		while(low <= high) {
			mid = (low + high)/2;
			if(arr[mid] == k) {
				if(mid == arr.length-1 || arr[mid+1] != k) {
					lOccurrence = mid;
					break;
				}else {
					low = mid+1;
				}
			}else if(arr[mid] > k) {
				high = mid -1;
			}else {
				low = mid+1;
			}
		}
		if(lOccurrence + fOccurrence == -2) {
			return -1;
		}
		return lOccurrence - fOccurrence +1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = countOccurrences(new int[] {1,1,1,1,1}, 1);
		System.out.println(x);
	}

}
