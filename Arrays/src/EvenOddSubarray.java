
public class EvenOddSubarray {

	public static int longestEvenOddSubarray(int[] arr) {
		int count = 0;
		int maxCount = 0;
		int evenIndicator = 0 ;
		int oddIndicator = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] % 2 == 0) {
				evenIndicator++;
				if(evenIndicator == 2) {
					if(count > maxCount) {
						maxCount = count;
					}
					count = 0;
					evenIndicator = 0;
				}else {
					count++;
					if(oddIndicator != 0) {
					oddIndicator--;
					}
					if(count > maxCount) {
						maxCount = count;
					}
				}
			}else {
				oddIndicator++;
				if(oddIndicator == 2) {
					if(count > maxCount) {
						maxCount = count;
					}
					count = 0;
					oddIndicator = 0;
				}else {
					count++;
					if(evenIndicator != 0) {
					evenIndicator--;
					}
					if(count > maxCount) {
						maxCount = count;
					}
				}
			}
		}
		return maxCount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = longestEvenOddSubarray(new int[] {10,12,14,7,8});
		System.out.println(x);
	}

}
