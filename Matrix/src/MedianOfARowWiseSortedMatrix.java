import java.util.Arrays;

public class MedianOfARowWiseSortedMatrix {
	
	public static int[] mergeTwoSortedArrays(int[] arr1 , int[] arr2) {
		int first = 0;
		int second = 0;
		int[] arr3 = new int[arr1.length + arr2.length]; 
		int three = 0;
		while(first + second < arr1.length + arr2.length) {
			if(first == arr1.length) {
				arr3[three++] = arr2[second++];
			}else if(second == arr2.length) {
				arr3[three++] = arr1[first++];
			}else if(arr1[first] < arr2[second]) {
				arr3[three++] = arr1[first++];
			}else {
				arr3[three++] = arr2[second++];
			}
		}
		return arr3;
	}
	
	public static int medianOfARowWiseSortedMatrix(int[][] arr) {
		int[] sortedArray = new int[arr.length*arr[0].length];
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			if(i == 0) {
				sortedArray = mergeTwoSortedArrays(arr[i], arr[i+1]);
			}else {
				sortedArray = mergeTwoSortedArrays(sortedArray, arr[i+1]);
			}
		}
		return sortedArray[sortedArray.length/2];
	}
	
	public static int medianBinarySearch(int[][] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int medPosi = ((arr.length * arr[0].length)+1)/2;
		int mid = 0;
		int midPosi = 0;
		int pos = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i][0] < min) {
				min = arr[i][0];
			}
			if(arr[i][arr[i].length-1] > max) {
				max = arr[i][arr[i].length-1];
			}
		}
		while(min < max) {
			mid = (min+max)/2;
			midPosi = 0;
			for(int i = 0 ; i < arr.length ; i++) {
				pos = Arrays.binarySearch(arr[i], mid) + 1;
				midPosi += Math.abs(pos);
			}
			if(midPosi < medPosi) {
				min = mid + 1;
			}else {
				max = mid;
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ques = {{5,10,20,30,40},{1,2,3,4,6},{11,13,15,17,19}};
		int x = medianBinarySearch(ques);
		System.out.println(x);
	}

}
