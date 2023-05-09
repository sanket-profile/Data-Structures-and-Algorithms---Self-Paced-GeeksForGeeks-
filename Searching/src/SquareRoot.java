
public class SquareRoot {

	public static int squareRoot(int x) {
		int low = 0;
		int high = x;
		int mid = 0;
		int square = 0;
		while(low < high) {
			mid = (low+high)/2;
			square = mid*mid;
			if(square == x) {
				return mid;
			}else if(square > x) {
				high = mid-1;
			}else {
				if((mid+1)*(mid+1) > x) {
					return mid;
				}else {
					low = mid+1;
				}
			}
		}
		return mid;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = squareRoot(100000000);
		System.out.println(x);
	}

}
