
public class CheckIfAStringIsSubsequenceOfOther {

	public static boolean isSubsequence(String s1 , String s2) {
		int index = 0;
		int prevIndex = -1;
		for(int i = 0 ; i < s2.length() ; i++) {
			if(s1.contains(s2.substring(i, i))) {
				index = s1.indexOf(s2.charAt(i));
				if(index < prevIndex) {
					return false;
				}
				prevIndex = index;
			}else {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isSubsequenceBetter(String s1 , String s2) {
		int first = 0;
		int second = 0;
		if(s2.length() > s1.length()) {
			return false;
		}
		while(first + second < s1.length() + s2.length()+1) {
			if(first == s1.length() && second == s2.length()) {
				return true;
			}else if(first == s1.length() && second < s2.length()) {
				return false;
			}else if(second == s2.length()) {
				return true;
			}else if(s1.charAt(first) == s2.charAt(second)) {
				first++;
				second++;
			}else if(s1.charAt(first) != s2.charAt(second)) {
				first++;
			}
		}
		return false;
	}
	
	public static boolean isSubsequenceBetterRecursive(String s1 ,String s2 , int n , int m) {
		if(m == 0) {
			return true;
		}
		if(n == 0) {
			return false;
		}
		if(s1.charAt(n-1) == s2.charAt(m-1)) {
			return isSubsequenceBetterRecursive(s1, s2, n-1, m-1);
		}else {
			return isSubsequenceBetterRecursive(s1, s2, n-1, m);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = isSubsequenceBetter("ABCD", "BCGFG");
		System.out.println(x);
	}

}
