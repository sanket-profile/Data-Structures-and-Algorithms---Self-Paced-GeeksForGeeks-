
public class PowerOfTwo {
	
	public static boolean isPowerOfTwo(int n) {
		int temp = 2;
		int count = 0;
		while(n != 0) {
			n = n >> 2;
			System.out.println(Integer.toBinaryString(n));
			if((n & 1) != 0) {
				count++;
			}
			
		}
		if(count % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = isPowerOfTwo(16);
		System.out.println(x);
	}

}
