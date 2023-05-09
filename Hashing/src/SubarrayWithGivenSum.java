import java.util.HashSet;

public class SubarrayWithGivenSum {

	public static boolean subarrayWithGivenSum(int[] arr , int k) {
		int sum = 0;
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
			if(sum == k) {
				return true;
			}
			set.add(sum);
			if(set.contains(sum - k)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = subarrayWithGivenSum(new int[] {2,3,4}, 9);
		System.out.println(x);
	}

}
