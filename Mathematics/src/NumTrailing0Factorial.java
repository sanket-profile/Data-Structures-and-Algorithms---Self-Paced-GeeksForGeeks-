
public class NumTrailing0Factorial {
	
	public static int trailingZeros(int n) {
		int count = 0;
		int temp = 0;
		for(int i = 5 ; i <= n ; i =i + 5) {
			temp = i;
			while(temp%5 == 0 && temp != 0 ) {
				temp = temp/5;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = trailingZeros(251);
		System.out.println(x);
		}

}
