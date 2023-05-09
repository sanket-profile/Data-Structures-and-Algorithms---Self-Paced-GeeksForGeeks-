
public class checkKthBit {
	
	public static boolean isKthBit(int n , int k) {
		int x = 1 << k-1;
		if((n & x) != 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = isKthBit(5, 3);
		System.out.println(x);
	}

}
