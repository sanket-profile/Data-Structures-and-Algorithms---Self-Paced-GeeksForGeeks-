import java.util.Arrays;

public class SortAnArrayWithThreeTypesOfElements {

	public static void swap(int[] arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void sortAnArrayWithThreeTypesOfElements(int[] arr) {
		int low = 0;
		int mid = 0;
		int high = arr.length-1;
		while(mid <= high) {
			if(arr[mid] == 0) {
				swap(arr, mid, low);
				low++;
				mid++;
			}else if(arr[mid] == 1) {
				mid++;
			}else {
				swap(arr, mid, high);
				high--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortAnArrayWithThreeTypesOfElements(new int[] {0,1,0,2,1,2});
	}

}
