import java.util.Arrays;

public class QuickSortLomutoPartition {

	public static void swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int lomutoPartition(int[] arr , int l , int h) {
		int pivot = arr[h];
		int pointer = 0;
		for(int i = l ; i  < h ; i++) {
			if(arr[i] <= pivot) {
				swap(arr, pointer, i);
				pointer ++;
			}
		}
		swap(arr, pointer, h);
		return pointer;
	}
	
	public static void quicksort(int[] arr , int l , int h) {
		if(l < h) {
			int p = lomutoPartition(arr, l, h);
			quicksort(arr, l, p-1);
			quicksort(arr, p+1, h);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,4,7,9,10,6};
		quicksort(arr, 0, 5);
		System.out.println(Arrays.toString(arr));
	}

}
