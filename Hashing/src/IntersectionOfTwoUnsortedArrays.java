import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoUnsortedArrays {

	public static void intersectionOfTwoUnsortedArrays(int[] arr1 , int[] arr2) {
		HashSet<Integer> set = new HashSet<>();
		int size = 0;
		for(int i = 0 ; i < arr2.length ; i++) {
			set.add(arr2[i]);
		}
		for(int i = 0 ; i < arr1.length ; i++) {
			size = set.size();
			set.add(arr1[i]);
			if(set.size() == size) {
				System.out.print(arr1[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intersectionOfTwoUnsortedArrays(new int[] {10,20}, new int[] {20,30});
	}

}
