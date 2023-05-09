import java.util.HashMap;

public class CheckForAnagram {

	public static boolean isAnagram(String s1 , String s2) {
		HashMap<Character, Integer> map = new HashMap<>();
		if(s1.length() != s2.length()) {
			return false;
		}
		for(int i = 0 ; i < s1.length() ; i++) {
			if(map.containsKey(s1.charAt(i))) {
				map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
			}else {
				map.put(s1.charAt(i), 1);
			}
		}
		for(int i = 0 ; i < s2.length() ; i++) {
			if(map.containsKey(s2.charAt(i))) {
				map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
				if(map.get(s2.charAt(i)) == 0) {
					map.remove(s2.charAt(i));
				}
			}else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = isAnagram("aab", "bab");
		System.out.println(x);
	}

}
