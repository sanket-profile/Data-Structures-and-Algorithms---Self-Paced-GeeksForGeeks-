import java.util.Arrays;

public class CountInversionsInArray {
	static int res = 0;
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
				res += arr1.length - first;
				second++;
				third++;
			}
		}
		return arr3;
	}
	
	public static int[] mergeSort(int[] arr , int l , int r) {
		if(l == r) {
			return new int[] {arr[l]};
		}
		if(l < r) {
			int mid = l + ((r-l)/2);
			return mergedArray(mergeSort(arr, l, mid), mergeSort(arr, mid+1, r));
		}
		return new int[] {};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = mergeSort(new int[] {40,30,20,10}, 0, 3);
		System.out.println(Arrays.toString(x));
		System.out.println(res);
	}

}
