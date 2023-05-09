import java.util.Arrays;

public class CheckIfStringsAreRotations {

	public static int[] RabinKarp(String s , String p1 , String p2) {
		int[] fOccurrences = new int[2];
		fOccurrences[0] = -1;
		fOccurrences[1] = -1;
		int tHash = 0;
		int p1Hash = (4*p1.charAt(1)) + (2*p1.charAt(0));
		int p2Hash = (4*p2.charAt(1)) + (2*p2.charAt(0));
		int d = 2;
		int temp = 0;
		int i = 0;
		while(i < s.length() - p1.length()) {
			if(temp < p1.length()) {
				while(temp < p1.length()) {
					tHash = (4*s.charAt(1)) + (2*s.charAt(0));
					temp++;
				}
				System.out.println(tHash + " " + p1Hash + " " + p2Hash);
				if(tHash == p1Hash) {
					if(s.substring(0, p1.length()).equals(p1)) {
						fOccurrences[0] = i;
						return fOccurrences;
					}
				}else if(tHash == p2Hash) {
					if(s.substring(0, p2.length()).equals(p2)) {
						fOccurrences[1] = i;
					}
				}
				i++;
			}else {
				tHash = (2*(tHash - s.charAt(i-1)*d) + s.charAt(i+p1.length()-1));
				if(tHash == p1Hash) {
					if(s.substring(i, i+p1.length()).equals(p1)) {
						fOccurrences[0] = i;
						return fOccurrences;
					}
				}else if(tHash == p2Hash) {
					if(s.substring(i, i+p2.length()).equals(p2)) {
						fOccurrences[1] = i;
					}
				}
				i++;
			}
		}
		return fOccurrences;
	}
	
	public static boolean areRotations(String s1 , String s2) {
		int start = -1;
		if(s1.length() != s2.length()) {
			return false;
		}
		if(s1.length() == 1) {
			if(s1.equals(s2)) {
				return true;
			}else {
				return false;
			}
		}else if(s1.length() == 2) {
			if(s1.equals(s2)) {
				return true;
			}else {
				s1 = s1.substring(1) + s1.charAt(0);
				if(s1.equals(s2)) {
					return true;
				}else {
					return false;
				}
			}
		}else {
			if(s2.indexOf(s1.substring(0, 2))  != -1) {
				start = s2.indexOf(s1.substring(0, 2));
			}else {
				start = s2.indexOf(s1.substring(1, 3));
				s1 = s1.substring(1) + s1.charAt(0);
			}
			//System.out.println(start);
			if(start == -1) {
				return false;
			}else {
				for(int i = 0 ; i < s1.length() ; i++) {
					if(s1.charAt(i) != s2.charAt(start)) {
						return false;
					}
					//System.out.println(start);
					start ++;
					if(start >= s2.length()) {
						start = 0;
					}
				}
			}
		}
		return true;
	}
	
	public static boolean areRotationsEasy(String s1 , String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		if((s1+s1).indexOf(s2) >= 0) {
			return true;
		}else {
			return  false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = areRotationsEasy("ABAB", "ABAB");
		System.out.println(x);
	}

}
