import java.util.Arrays;
import java.util.HashMap;

public class LeftmostNonRepeatingElement {

	public static int leftmostNonRepeatingElement(String s) {
		int res = Integer.MAX_VALUE;
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		for(int i = 0 ; i < s.length() ; i++) {
			if(arr[s.charAt(i) - 97] == -1) {
				arr[s.charAt(i) - 97] = i;
			}else {
				arr[s.charAt(i) - 97] = -2;
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] >= 0) {
				res = Math.min(res, arr[i]);
			}
		}
		if(res == Integer.MAX_VALUE) {
			res = -1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = leftmostNonRepeatingElement("abcd");
		System.out.println(x);
	}

}
