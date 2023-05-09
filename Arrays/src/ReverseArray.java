
public class ReverseArray {

	public static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		int temp = 0;
		while(start <= end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+"----");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseArray(new int[] {1,2,3,4,5,6,7,8});

	}

}
