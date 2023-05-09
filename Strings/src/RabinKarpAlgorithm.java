
public class RabinKarpAlgorithm {

	public static void rabinKarpAlgorithm(String s , String p) {
		int temp = 0;
		double pHash = 0;
		double tHash = 0;
		String pattern = "";
		int d = 1;
		for(int i = 1 ; i <= p.length()-1 ; i++) {
			d = (d*2)%50599;
		}
		for(int i = 0 ; i < p.length() ; i++) {
			pHash = ((pHash*2) + p.charAt(i))%50599;
		}
		for(int i = 0 ; i <= s.length()-p.length() ; i++) {
			if(temp < p.length()) {
				while(temp < p.length()) {
					tHash = ((tHash*2) + s.charAt(temp))%50599;
					temp++;
				}
				if(tHash == pHash) {
					pattern = s.substring(0, p.length());
					if(pattern.equals(p)) {
						System.out.print(i + " ");
					}
				}
			}else {
				tHash = (2*(tHash - (s.charAt(i-1)*d)) + s.charAt(i+ p.length()-1))%50599;
				if(tHash < 0) {
					tHash = tHash + 50599;
				}
				if(tHash == pHash) {
					pattern = s.substring(i, i+p.length());
					if(pattern.equals(p)) {
						System.out.print(i + " ");
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rabinKarpAlgorithm("abdabcbabc", "abc");
	}

}
