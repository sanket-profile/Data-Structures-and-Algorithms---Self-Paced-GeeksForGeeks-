
public class BinarySearchIterative {

	public static int binarySearch(int[] arr , int k) {
		int left = 0;
		int right = arr.length;
		int pointer = arr.length/2;
		while(right - left != 0) {
			if(arr[pointer] == k) {
				return pointer;
			}else if(arr[pointer] > k) {
				right = right/2;
				pointer = right/2;
			}else {
				left =  pointer;
				pointer = left + ((right - left)/2);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = binarySearch(new int[] {10,20,30,40,50,60,70}, 70);
		System.out.println(x);
	}

}
