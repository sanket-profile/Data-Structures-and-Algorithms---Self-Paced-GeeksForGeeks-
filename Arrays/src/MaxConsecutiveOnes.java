
public class MaxConsecutiveOnes {

	public static int maxOnes(int[] arr) {
		int maxcount = 0;
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == 1) {
				count++;
			}else {
				if(count > maxcount) {
					maxcount = count;
				}
				count =0;
			}
		}
		if(maxcount ==0) {
			return count;
		}
		return maxcount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = maxOnes(new int[] {1,1,1,1});
		System.out.println(x);
	}

}
