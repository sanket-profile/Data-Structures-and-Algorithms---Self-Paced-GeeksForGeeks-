import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {

	public static int longestConsecutiveSubsequence(int[] arr) {
		int count = 1;
		int maxCount = 1;
		Arrays.sort(arr);
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			if(arr[i] + 1 == arr[i+1]) {
				count++;
			}else if(arr[i] == arr[i+1]){
				continue;
			}else {
				count = 0;
			}
			maxCount = Math.max(maxCount, count);
		}
		return maxCount;
	}
	
	public static int longestConsecutiveSubsequenceHashingVersion(int[] arr) {
		int count = 1;
		int maximum = 0;
		int temp = 1;
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0 ; i < arr.length ; i++) {
			set.add(arr[i]);
		}
		for(int i = 0 ; i < set.size() ; i++) {
			if(set.contains(arr[i]-1)) {
				continue;
			}else {
				if(set.contains(arr[i]+temp)) {
					while(set.contains(arr[i] + temp)) {
						count ++;	
						temp++;
					}
					maximum = Math.max(maximum, count);
					count = 1;
					temp = 1;
				}
			}
		}
		return maximum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = longestConsecutiveSubsequenceHashingVersion(new int[] {1,3,4,3,3,2,9,10});
		System.out.println(x);
	}

}
