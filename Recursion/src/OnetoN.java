
public class OnetoN {
	
	public static void print1ToN(int n) {
		if(n == 0) {
			return;
		}
		print1ToN(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print1ToN(5);
	}

}
