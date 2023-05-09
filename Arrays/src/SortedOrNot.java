
public class SortedOrNot {

	public static boolean isSorted(int[] arr) {
		for(int i = 0 ; i < arr.length -1 ; i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = isSorted(new int[] {20,20,20});
		System.out.println(x);
	}

}
