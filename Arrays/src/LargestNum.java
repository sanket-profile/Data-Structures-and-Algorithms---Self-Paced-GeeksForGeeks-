
public class LargestNum {
	
	public static int largestNum(int[] arr) {
		int largeNum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > largeNum) {
				largeNum = arr[i];
			}
		}
		return largeNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = largestNum(new int[] {1,2,3,4,587,888});
		System.out.println(x);
	}

}
