
public class SumOfNaturalNums {
	
	public static int sumOfNaturalNums(int n) {
		if(n == 0) {
			return 0;
		}
		return n + sumOfNaturalNums(n-1); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = sumOfNaturalNums(5);
		System.out.println(x);
	}

}
