import java.util.HashSet;

public class UnionOfTwoUnsortedArrays {

	public static int unionOfTwoUnsortedArrays(int[] arr1 , int[] arr2) {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0 ; i < arr1.length ; i ++) {
			set.add(arr1[i]);
		}
		for(int i = 0 ; i < arr2.length ; i ++) {
			set.add(arr2[i]);
		}
		return set.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = unionOfTwoUnsortedArrays(new int[] {15,20,5,15}, new int[] {15,15,15,20,10});
		System.out.println(x);
	}

}
