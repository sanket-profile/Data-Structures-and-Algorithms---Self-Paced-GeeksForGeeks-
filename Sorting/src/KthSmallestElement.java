
public class KthSmallestElement {

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
	
	public static int quicksort(int[] arr , int l , int h , int k) {
		while(l < h) {
		if(l <= h) {
			int p = lomutoPartition(arr, l, h);
			if(p == k-1) {
				return arr[p];
			}else if(p < k-1) {
				l = p+1;
			}else {
				h = p-1;
			}
		}
			
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = quicksort(new int[] {10,3,5,20}, 0, 3, 2);
		System.out.println(x);
	}

}
