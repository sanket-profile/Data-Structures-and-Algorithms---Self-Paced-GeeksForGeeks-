
public class PalindromeCheck {

	public static boolean isPalindrome(String s , int start , int end) {
		if(start >= end) {
			return true;
		}
		if(s.charAt(start) != s.charAt(end)) {
			return false;
		}else {
			return isPalindrome(s, start+1, end-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = isPalindrome("ABCDCBA", 0, 6);
		System.out.println(x);
	}

}
