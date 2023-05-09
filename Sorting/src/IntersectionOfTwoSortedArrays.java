
public class IntersectionOfTwoSortedArrays {

	public static void intersectionOfTwoSortedArrays(int[] arr1, int[] arr2) {
		int first = 0;
		int second = 0;
		while(first + second < arr1.length + arr2.length) {
			if(first == arr1.length || second == arr2.length) {
				return;
			}
			if(first != 0) {
				while(arr1[first] == arr1[first-1]) {
					first++;
				}
			}
			if(second != 0) {
				while(arr2[second] == arr2[second-1]) {
					second++;
				}
			}
			if(arr1[first] == arr2[second]) {
				System.out.println(arr1[first]);
				first++;
				second++;
			}else if(arr1[first] < arr2[second]) {
				first++;
			}else {
				second++;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,1,3,3,3,5,9,9};
		int[] arr2 = {1,1,1,3,5,7,9};
		intersectionOfTwoSortedArrays(arr1,arr2);
	}

}
