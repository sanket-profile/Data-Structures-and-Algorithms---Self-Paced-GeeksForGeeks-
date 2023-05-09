
public class KMPAlgorithmPart2CompleteAlgorithm {

	public static int[] LPSArrayON(String s) {
		int[] lps = new int[s.length()];
		int len = 0;
		lps[0] = 0;
		int i = 1;
		while(i < s.length()) {
			if(s.charAt(len) == s.charAt(i)) {
				len++;
				lps[i] = len;
				i++;
			}else {
				if(len == 0) {
					lps[i] = 0;
					i++;
				}else {
					lps[i] = lps[len--];
				}
			}
		}
		return lps;
	}
	
	public static void KMP(String s , String p) {
		int[] lps = LPSArrayON(s);
		int j = 0;
		int i = 0;
		while(i < s.length()) {
			if(s.charAt(i) == p.charAt(j)) {
				i++;
				j++;
			}
			if(j == p.length()) {
				System.out.print(i-j + " ");
				j = lps[j-1];
			}else if(i < s.length() && p.charAt(j) != s.charAt(i)) {
				if(j == 0) {
					i++;
				}else {
					j = lps[j-1];
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KMP("ababcababaad", "ababa");
	}

}
