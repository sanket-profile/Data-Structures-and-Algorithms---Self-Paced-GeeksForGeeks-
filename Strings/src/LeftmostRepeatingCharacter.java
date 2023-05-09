import java.util.HashMap;

public class LeftmostRepeatingCharacter {

	public static int leftmostRepeatingCharacter(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		int res = Integer.MAX_VALUE;
		for(int i = s.length()-1 ; i >= 0 ; i--) {
			if(map.containsKey(s.charAt(i))) {
				res = i;
			}else {
				map.put(s.charAt(i), i);
			}
		}
		if(res == Integer.MAX_VALUE) {
			res = -1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = leftmostRepeatingCharacter("geeksforgeeks");
		System.out.println(x);
	}

}
