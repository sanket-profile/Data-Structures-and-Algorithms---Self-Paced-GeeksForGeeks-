/**
 * 
 */

/**
 * @author sanketsaxena
 *
 */
public class PalindromeNum {

	/**
	 * @param args
	 */
	public static boolean numPalindrome(int x) {
		int reverseNum = 0;
		int num = x;
		int temp = 0;
		int i = 10;
		while(x > 0) {
			temp = x % 10;
			reverseNum = reverseNum*i + temp ;
			x = x/10;
			}
		if(reverseNum == num) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = numPalindrome(1234554321);
		System.out.println(a);
	}

}
