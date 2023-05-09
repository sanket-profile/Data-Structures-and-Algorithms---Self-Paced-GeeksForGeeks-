
public class LastOccurrence {

	public static int firstOccurrence(int[] arr , int k) {
		int lOccurrence = -1;
		int low = 0;
		int high = arr.length-1;
		int mid= 0;
		while(low <= high) {
			mid = (low + high)/2;
			if(arr[mid] == k) {
				if(mid == arr.length-1 || arr[mid+1] != k) {
					return mid;
				}else {
					low = mid+1;
				}
			}else if(arr[mid] > k) {
				high = mid -1;
			}else {
				low = mid+1;
			}
		}
		return lOccurrence;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = firstOccurrence(new int[] {1,1}, 1);
		System.out.println(x);
	}

}
