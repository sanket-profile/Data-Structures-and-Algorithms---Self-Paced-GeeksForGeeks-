import java.util.Arrays;

public class HoarePartition {

	public static void swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int hoarePartition(int[] arr) {
		int pivot = arr[0];
		int low = -1;
		int high = arr.length;
		while(true) {
			do {
				low++;
			}while(arr[low] < pivot) ;
			do {
				high--;
			}while(arr[high] > pivot) ;
			if(low >= high) {
				System.out.println(Arrays.toString(arr) + "  " + high);
				return high;
			}else {
			swap(arr , low , high);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hoarePartition(new int[] {115,80,30,90,40,50,90});
	}

}
