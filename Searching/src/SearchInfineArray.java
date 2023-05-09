
public class SearchInfineArray {

	public static int searchInfiniteArray(int[] arr , int k) {
		int low = -1;
		int high = -1;
		int i = 1;
		int mid = -1;
		if(arr[0] == k) {
			return 0;
		}
		while(arr[i] <= k) {
			if(arr[i] == k) {
				return i;
			}else if(arr[i] < k) {
				if(arr[i+1] == k) {
					return i+1;
				}else if(arr[i+1] > k) {
					return -1;
				}
				low =i;
				i = i*2;
			}
		}
		high = i;
		while(low < high) {
			mid = (low + high)/2;
			if(arr[mid] == k) {
				return mid;
			}else if(arr[mid] > k) {
				if(arr[mid -1] == k) {
					return mid -1;
				}else {
				high = mid -1;
				}
			}else {
				if(arr[mid+1] == k) {
					return mid+1;
				}else {
				low = mid+1;
				}
			}
		}
		return mid;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = searchInfiniteArray(new int[] {1,10,15,20,40,80,90,100,120,500}, 12);
		System.out.println(x);
	}

}
