
public class IterativePow {
	public static int computePow(int x , int n) {
		String s = Integer.toBinaryString(n);
		System.out.println(s);
		int temp = 1;
		for(int i = s.length()-1 ; i >= 0  ; i--) {
			if(s.charAt(i) == '1') {
				temp = temp * x;
			}
			x *= x;
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = computePow(4, 5);
		System.out.println(x);
		
	}

}
