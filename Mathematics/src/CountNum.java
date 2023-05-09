/**
 * 
 */

/**
 * @author sanketsaxena
 *
 */
public class CountNum {

	/**
	 * @param args
	 */
	
	public static int numCount(int x) {
		int count = 0;
		while(x > 0) {
			x = x / 10;
			count ++ ;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = numCount(5067890);
		System.out.println(x);
	}

}
