import java.util.Arrays;

public class SelectionSort {

	public static void swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void selectionSort(int[] arr) {
		int temp = 0;
		int minimum = 0; 
		for(int i = 0; i < arr.length-1; i++) {
			minimum = arr[i]; 
			temp = i;
			for(int j = i+1 ; j < arr.length ; j++) {
				if(minimum > arr[j]) {
					minimum = arr[j];
					temp = j;
				}
			}
			swap(arr, i, temp);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5,4,6};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
