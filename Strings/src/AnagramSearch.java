import java.util.HashMap;

public class AnagramSearch {

	public static boolean isAnagram(String s1 , String s2) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0 ; i < s1.length() ; i++) {
			if(map.containsKey(s1.charAt(i))) {
				map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
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
		return (map.size() == 0);
	}
	
	public static boolean rabinKarpAlgorithm(String s , String p) {
		int temp = 0;
		double pHash = 0;
		double tHash = 0;
		String pattern = "";
		int d = 1;
		for(int i = 1 ; i <= p.length()-1 ; i++) {
			d = (d*2)%50599;
		}
		for(int i = 0 ; i < p.length() ; i++) {
			pHash = (pHash + p.charAt(i))%50599;
		}
		for(int i = 0 ; i <= s.length()-p.length() ; i++) {
			if(temp < p.length()) {
				while(temp < p.length()) {
					tHash = (tHash + s.charAt(temp))%50599;
					temp++;
				}
				if(tHash == pHash) {
					pattern = s.substring(0, p.length());
					if(isAnagram(pattern, p)) {
						return true;
					}
				}
			}else {
				tHash = (tHash - (s.charAt(i-1)) + s.charAt(i+ p.length()-1))%50599;
				if(tHash < 0) {
					tHash = tHash + 50599;
				}
				if(tHash == pHash) {
					pattern = s.substring(i, i+p.length());
					if(isAnagram(pattern, p)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = rabinKarpAlgorithm("geeksforgeeks", "rseek");
		System.out.println(x);
	}

}
