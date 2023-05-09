
public class LeftRotateByD {

	public static void reverseArray(int[] arr ,int start , int end) {
		int temp = 0;
		while(start <= end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void rotateByD(int[] arr , int d) {
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, arr.length-1);
		reverseArray(arr, 0, arr.length-1);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+"----");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotateByD(new int[] {1,2,3,4,5}, 2);
	}

}
