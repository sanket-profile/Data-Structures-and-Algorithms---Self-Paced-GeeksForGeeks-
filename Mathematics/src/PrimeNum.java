
public class PrimeNum {
	public static boolean primeNum(int a) {
		if(a == 2) {
			return true;
		}else {
			for(int i =2 ; i < Math.pow(a, 0.5) + 1 ; i++) {
				if(a%i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		boolean x = primeNum(4877);
		System.out.println(x);
		// TODO Auto-generated method stub

	}

}
