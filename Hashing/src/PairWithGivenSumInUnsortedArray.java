import java.util.HashSet;

public class PairWithGivenSumInUnsortedArray {

	public static boolean pairWithGivenSumInUnsortedArray(int[] arr , int k) {
		HashSet<Integer> set = new HashSet<>();
		int size = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			size = set.size();
			set.add(arr[i]);
			if(set.size() == size && arr[i] == k/2) {
				return true;
			}
		}
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == k/2) {
				continue;
			}
			if(set.contains(k-arr[i])) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = pairWithGivenSumInUnsortedArray(new int[] {2,1,6,3}, 1);
		System.out.println(x);
	}

}
