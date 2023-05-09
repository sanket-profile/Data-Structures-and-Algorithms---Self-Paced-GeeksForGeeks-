import java.util.HashMap;
import java.util.HashSet;

public class LongestSubarrayWithGivenSum {

	public static int longestSubarrayWithGivenSum(int[] arr , int k) {
		int count = 0;
		int maxCount = 0;
		int sum = 0;
		int startIndex = -1;
		HashMap<Integer , Integer> map = new HashMap<>();
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
			if(map.containsKey(sum-k)) {
				startIndex = map.get(sum-k);
				count = i - startIndex;
				maxCount = Math.max(maxCount, count);
				count = 0;
			}
			if(sum == k) {
				count = i + 1;
				maxCount = Math.max(maxCount, count);
				count = 0;
			}if(map.containsKey(sum) == false) {
				map.put(sum, i);
			}
		}
		return maxCount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = longestSubarrayWithGivenSum(new int[] {1,1,1,1}, 8);
		System.out.println(x);
	}

}
