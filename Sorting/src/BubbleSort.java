import java.util.Arrays;

public class BubbleSort {

	public static void swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void bubbleSort(int[] arr) {
		boolean swapped = false;
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			swapped = false;
			for(int j = 0 ; j < arr.length - 1 - i ; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
			swapped = false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = {1,2,3,20,5,6};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
