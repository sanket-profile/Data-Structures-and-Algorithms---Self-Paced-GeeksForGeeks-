import java.util.Arrays;

public class SearchInRowWiseAndColumnWiseSortedMatrix {

	public static int binarySearchCheck(int[] arr , int k) {
		int low = 0;
		int high = arr.length-1;
		int mid = 0;
		while(low <= high) {
			mid = (low+high)/2;
			if(arr[mid] == k) {
				return mid;
			}else if(arr[mid] < k) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		return low - 1;
	}
	
	public static int binarySearch(int[] arr , int k) {
		int low = 0;
		int high = arr.length -1;
		int mid = 0;
		while(low <= high) {
			mid = (low+high)/2;
			if(arr[mid] == k) {
				return mid;
			}else if(arr[mid] < k) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		return - 1;
	}
	
	public static int[] searchElement(int[][] arr , int k) {
		int[] pair = {-1,-1};
		int[] rowArray = new int[arr.length];
		int column = binarySearchCheck(arr[0], k);
		if(column == -1) {
			return pair;
		}
		for(int i = 0 ; i < arr.length ; i++) {
			rowArray[i] = arr[i][column];
		}
		int row = binarySearch(rowArray, k);
		if(row != -1) {
			pair[0] = row;
			pair[1] = column;
		}
		return pair;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ques = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
		int[] x = searchElement(ques , 40);
		System.out.println(Arrays.toString(x));
	}

}
