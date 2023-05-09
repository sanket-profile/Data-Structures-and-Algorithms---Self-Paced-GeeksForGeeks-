
public class Factorial {
	public static int factorial(int n) {
		int facto = 0;
		if(n == 0) {
			return 1;
		}
		facto = n * factorial(n - 1);
		return facto;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = factorial(5);
		System.out.println(x);
	}

}
