import java.util.Arrays;

public class SortAnArrayWithTwoTypesOfElements {

	public static void swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void partition(int[] arr) {
		int pointer = 0;
		for(int i = 0 ; i < arr.length-1 ; i ++) {
			if(arr[i] < 0) {
				swap(arr, pointer, i);
				pointer++;
			}
		}
		if(arr[arr.length-1] < 0) {
			swap(arr, arr.length-1, pointer);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		partition(new int[] {15,-3,-2,18});
	}

}
