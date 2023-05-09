import java.util.HashSet;

public class SubarrayWithZeroSum {

	public static boolean subarrayWithZeroSum(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		int sum = 0;
		int size = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == 0) {
				return true;
			}
			sum += arr[i];
			size = set.size();
			set.add(sum);
			if(set.size() == size) {
				return true;
			}
		}
		if(sum == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = subarrayWithZeroSum(new int[] {0,2,1});
		System.out.println(x);
	}

}
