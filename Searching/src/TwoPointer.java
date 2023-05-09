
public class TwoPointer {

	public static boolean twoPointer(int[] arr , int k) {
		boolean ans = false;
		int low = 0;
		int high = arr.length-1;
		while(low < high) {
			if(arr[low] + arr[high] == k) {
				return true;
			}else if(arr[low] + arr[high] < k) {
				low += 1;
			}else {
				high -= 1;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = twoPointer(new int[] {2,5,8,12,30}, 17);
		System.out.println(x);
	}

}
