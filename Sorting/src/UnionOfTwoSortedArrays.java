
public class UnionOfTwoSortedArrays {

	public static void UnionOfTwoSortedArrays(int[] arr1, int[] arr2) {
		int first = 0;
		int second = 0;
		while(first + second < arr1.length + arr2.length -1) {
			
			if(first == arr1.length) {
				System.out.println(arr2[second]);
				second++;
				continue;
			}
			if(second == arr2.length) {
				System.out.println(arr1[first]);
				first++;
				continue;
			}
			if(first!=0 && first != arr1.length) {
				while(arr1[first] == arr1[first-1]) {
					first++;
				}
			}
			if(second!=0 && second != arr2.length) {
				while(arr2[second] == arr2[second-1]) {
					second++;
				}
			}
			
			if(arr1[first] == arr2[second]) {
				System.out.println(arr1[first]);
				first++;
				second++;
			}else if(arr1[first] < arr2[second]) {
				System.out.println(arr1[first]);
				first++;
			}else {
				System.out.println(arr2[second]);
				second++;
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,4,18,19,19,28,29,32,35,35,39,39,44,49,49,50,50};
		int[] arr2 = {8,34};
		UnionOfTwoSortedArrays(arr1,arr2);
	}

}
