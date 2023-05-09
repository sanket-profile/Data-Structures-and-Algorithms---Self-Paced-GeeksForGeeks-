
public class Pallindrome {

	public static boolean isPallindrome(String s , int start , int end) {
		if(start >= end) {
			return true;
		}
		if(s.charAt(start) != s.charAt(end)) {
			return false;
		}else {
			return isPallindrome(s, start+1, end-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = isPallindrome("acba", 0, 3);
		System.out.println(x);

	}

}
