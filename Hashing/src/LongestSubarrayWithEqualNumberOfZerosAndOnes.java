import java.util.HashMap;

public class LongestSubarrayWithEqualNumberOfZerosAndOnes {

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
	
	public static int longestSubarrayWithEqualNumberOfZerosAndOnes(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == 0) {
				arr[i] = -1;
			}
		}
		return longestSubarrayWithGivenSum(arr, 0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = longestSubarrayWithEqualNumberOfZerosAndOnes(new int[] {1,0,1,1,1,0,0});
		System.out.println(x);
	}

}
