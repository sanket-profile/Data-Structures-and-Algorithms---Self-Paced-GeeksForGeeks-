
public class GCD {
	public static int gcd(int a , int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b,a%b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = gcd(4, 6);
		System.out.println(x);
	}

}
