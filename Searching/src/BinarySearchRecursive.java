
public class BinarySearchRecursive {

	public static int binarySearchRecursive(int[] arr , int k , int left , int right) {
		if(right < left) {
			return -1;
		}
		int mid = (left + right)/2;
		if(arr[mid] == k) {
			return mid;
		}else if(arr[mid] > k) {
			return binarySearchRecursive(arr, k, left, mid-1);
		}else {
			return binarySearchRecursive(arr, k, mid+1, right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = binarySearchRecursive(new int[] {10,20,30,40,50,60,70}, 70 , 0 , 6);
		System.out.println(x);
	}

}
