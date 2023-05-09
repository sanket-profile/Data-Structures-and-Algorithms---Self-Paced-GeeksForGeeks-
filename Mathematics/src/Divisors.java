
public class Divisors {
	
	public static void divisors(int n){
		for(int i = 1 ; i <=Math.pow(n, 0.5) + 1 ; i++) {
			if(n%i == 0) {
				System.out.println(i);
				if(i != n/i) {
					System.out.println(n/i);
					Math.log)
				}
				}
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divisors(100);
	}

}
