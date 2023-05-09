
public class SumOgDigits {

	public static int sumOfDigits(int n) {
		if(n == 0) {
			return 0;
		}
		return (n%10) + sumOfDigits(n/10);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = sumOfDigits(10);
		System.out.println(x);
	}

}
