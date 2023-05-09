
public class PeakElement {

	public static int peakElement(int[] arr) {
		int mid = -1;
		int low = 0;
		int high = arr.length -1;
		while(low < high) {
			mid = (low+high)/2;
			if(mid == 0 || arr[mid] >= arr[mid-1] && mid == arr.length-1 || arr[mid] >= arr[mid+1]) {
				return mid;
			}else if(arr[mid] < arr[mid-1]) {
				high = mid;
			}else {
				low = mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = peakElement(new int[] {10,20,5,23,90,67});
		System.out.println(x);
	}

}
