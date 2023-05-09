
public class ComputePower {
	
	public static int computePow(int x , int n) {
		if(n == 0) {
			return 1;
		}
		int temp = computePow(x, n/2);
		temp = temp * temp;
		if(n%2 == 0) {
			return temp;
		}else {
			return temp * x;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = computePow(2, 4);
		System.out.println(x);
	}

}
