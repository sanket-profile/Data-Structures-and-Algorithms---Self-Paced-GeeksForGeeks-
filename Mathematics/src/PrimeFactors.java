import java.util.ArrayList;

public class PrimeFactors {
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
	
	public static ArrayList<Integer> primeFactors(int n){
		ArrayList<Integer> primeFac = new ArrayList<>();
		int temp = n;
		if(primeNum(n)) {
			primeFac.add(n);
			return primeFac ;
		}else {
			for(int i = 2 ; i <= Math.pow(n, 0.5)+ 1 ; i++) {
				while(temp%i == 0) {
					primeFac.add(i);
					temp = temp/i;
				}
			}
		}
		if(temp >1) {
			primeFac.add(temp);
		}
		return primeFac;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> x = primeFactors(100);
		System.out.println(x);
	}

}
