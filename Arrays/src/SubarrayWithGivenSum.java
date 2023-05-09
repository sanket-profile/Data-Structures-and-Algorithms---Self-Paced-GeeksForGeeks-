
public class SubarrayWithGivenSum {

	public static boolean isGivenSumPresent(int[] arr , int sum) {
		boolean isPresent = false;
		int calcSum = 0;
		int posi = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			calcSum += arr[i];
			if(calcSum == sum) {
				return true;
			}else if(calcSum + arr[i] > sum) {
				while(calcSum > sum) {
					calcSum -= arr[posi];
					posi++;
					if(calcSum == sum) {
						return true;
					}
				}
			}
		}
		return isPresent;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = isGivenSumPresent(new int[] {4,8,12,5}, 5);
		System.out.println(x);
	}

}
