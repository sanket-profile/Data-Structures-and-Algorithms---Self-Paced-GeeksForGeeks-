import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int j = 0;
		int key = 0;
		for(int i = 1 ; i < arr.length ; i++) {
			key = arr[i];
			j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,10,5,4,6};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
