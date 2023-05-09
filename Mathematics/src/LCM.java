
public class LCM {
	public static int gcd(int a , int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b , a%b);
		}
	}
	public static int lcm(int a , int b) {
		int gcdOfAB = gcd(a,b);
		a = a/gcdOfAB;
		b = b/gcdOfAB;
		return a*b*gcdOfAB;
	}

	public static void main(String[] args) {
		int x = lcm(4,6);
		System.out.println(x);
		// TODO Auto-generated method stub

	}

}
