import java.util.HashMap;

public class LongestSubstringWithDistinctCharacters {

	public static int longestSubstringWithDistinctCharacters(String s) {
		int count = 0;
		int maxCount = 0;
		int start = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0 ; i < s.length() ; i++) {
			if(map.containsKey(s.charAt(i))) {
				if(map.get(s.charAt(i)) < start) {
					map.put(s.charAt(i), i);
					count++;
					maxCount = Math.max(maxCount, count);
					continue;
				}
				count -= (map.get(s.charAt(i)) + 1 - start);
				count++;
				maxCount = Math.max(maxCount, count);
				start = map.get(s.charAt(i))+1;
				System.out.println(count + " " + i);
				map.put(s.charAt(i), i);
			}else {
				map.put(s.charAt(i), i);
				count++;
				System.out.println(count + " " + i);
				maxCount = Math.max(maxCount, count);
			}
		}
		return maxCount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = longestSubstringWithDistinctCharacters("pwwkew");
		System.out.println(x);
	}

}
