import java.util.Arrays;

public class KMPAlgorithmPart1ConstructingLPSArray {

	public static int LPS(String s , int start , int end) {
		String[] prefix = new String[end-1];
		String[] suffix = new String[end-1];
		String pCurr = "";
		String sCurr = "";
		int posi = 0;
		for(int i = start ; i < end-1 ; i++) {
			pCurr += s.charAt(i);
			sCurr = s.charAt(end-1-i) + sCurr;
			prefix[posi] = pCurr ;
			suffix[posi] = sCurr ;
			posi++;
		}
		for(int i = prefix.length - 1 ; i >= 0 ; i--) {
			if(suffix[i].equals(prefix[i])) {
				return suffix[i].length();
			}
		}
		return 0;
	}
	
	public static int[] LPSArray(String s) {
		int[] lpsArray = new int[s.length()];
		for(int i = 0 ; i < s.length() ; i++) {
			lpsArray[i] = LPS(s, 0, i+1);
		}
		return lpsArray;
	}
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = LPSArrayON("abcd");
		System.out.println(Arrays.toString(x));
	}

}
