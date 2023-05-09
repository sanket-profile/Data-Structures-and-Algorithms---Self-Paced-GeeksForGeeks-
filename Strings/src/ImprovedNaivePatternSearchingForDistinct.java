
public class ImprovedNaivePatternSearchingForDistinct {

	public static void improvedNaivePatternSearchingForDistinct(String s , String p) {
		int j = 0;
		for(int i = 0 ; i <= s.length()-p.length();) {
			for(j = 0 ; j < p.length() ;j++) {
				if(s.charAt(i+j) != p.charAt(j)) {
					break;
				}
			}
			if(j == p.length()) {
				System.out.print(i + " ");
			}
			if(j == 0) {
				i++;
			}else {
				i = i + j;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		improvedNaivePatternSearchingForDistinct("ABCABCDABCD", "ABCD");
	}

}
