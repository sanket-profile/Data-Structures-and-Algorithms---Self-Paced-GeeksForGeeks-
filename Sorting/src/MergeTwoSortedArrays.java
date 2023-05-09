import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static int[] mergedArray(int[] arr1 , int[] arr2) {
		int[] arr3 = new int[arr1.length+arr2.length];
		int first = 0;
		int second = 0;
		int third = 0;
		while(third < arr1.length+arr2.length) {
			if(first == arr1.length) {
				arr3[third] = arr2[second];
				second++;
				third++;
			}else if(second == arr2.length) {
				arr3[third] = arr1[first];
				first++;
				third++;
			}else if(arr1[first] == arr2[second]) {
				arr3[third++] = arr1[first];
				arr3[third++] = arr2[second];
				first++;
				second++;
			}else if(arr1[first] < arr2[second]) {
				arr3[third] = arr1[first];
				first++;
				third++;
			}else {
				arr3[third] = arr2[second];
				second++;
				third++;
			}
		}
		return arr3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = mergedArray(new int[] {1,3,5,7,9,10}, new int[] {0,2,4,6,8,10,12});
		System.out.println(Arrays.toString(arr));
	}

}
