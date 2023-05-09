import java.util.Arrays;

public class LomutoPartition {

	public static void swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void lomutoPartition(int[] arr) {
		int pointer = 0;
		for(int i = 0; i < arr.length -1 ; i++) {
			if(arr[i] <= arr[arr.length-1]) {
				swap(arr, i , pointer);
				pointer++;
			}
		}
		swap(arr , arr.length-1 , pointer);
		System.out.println(Arrays.toString(arr) + pointer);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lomutoPartition(new int[] {10,80,30,90,40,50,0});
	}

}
