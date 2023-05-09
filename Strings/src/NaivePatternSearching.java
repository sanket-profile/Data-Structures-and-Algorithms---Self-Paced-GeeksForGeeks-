
public class NaivePatternSearching {

	public static void naivePatternSearching(String s , String p) {
		int temp = 0;
		String pattern = "";
		int i = 0;
		while(i <= s.length()-p.length()) {
			if(temp < p.length()) {
				while(temp < p.length()) {
					pattern += s.charAt(temp);
					temp++;
				}
				if(pattern.equals(p)) {
					System.out.print(i + " ");
				}
				i++;
			}else {
				pattern = pattern.substring(1);
				pattern += s.charAt(i+p.length()-1);
				if(pattern.equals(p)) {
					System.out.print(i + " ");
				}
				i++;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		naivePatternSearching("AAAAA", "AAA");
	}

}
