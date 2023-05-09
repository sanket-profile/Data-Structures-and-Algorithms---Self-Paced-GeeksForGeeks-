
public class TripletSum {

	public static boolean tripletSum(int[] arr , int k) {
		boolean ans = false;
		int low = -1;
		int high = arr.length -1;
		if(arr.length == 3) {
			if(arr[0]+arr[1]+arr[2] == k) {
				return true;
			}else {
				return false;
			}
		}else {
			for(int i = 0 ; i < arr.length - 2 ; i++) {
				low = i+1;
				high = arr.length -1;
				while(low < high) {
					if(arr[i]+arr[low]+arr[high] == k) {
						return true;
					}else if(arr[i]+arr[low]+arr[high] < k) {
						low += 1;
					}else {
						high -= 1;
					}
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = tripletSum(new int[] {2,3,4,8,9,20,40}, 32);
		System.out.println(x);
	}

}
