
public class RopeProblem {

	public static int maxCuts(int n , int a , int b, int c) {
		if(n == 0) {
			return 0;
		}
		if(n < 0) {
			return -1;
		}
		int res = Math.max(maxCuts(n-a, a, b, c) , maxCuts(n-b, a, b, c));
		res = Math.max(res, maxCuts(n-c, a, b, c));
		
		if(res == -1) {
			return -1;
		}
		res += 1;
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxCuts(23, 12, 9, 11));
	}

}
