
public class MajorityElement {

	public static int majorityElemrnt(int[] arr) {
		int majorityIndex = 0;
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == arr[majorityIndex]) {
				count++;
			}else {
				count--;
			}
			if(count == 0) {
				majorityIndex = i;
				count = 1;
			}
		}
		count = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == arr[majorityIndex]) {
				count++;
			}
		}
		if(count > arr.length/2) {
			return majorityIndex;
		}else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = majorityElemrnt(new int[] {3,7,4,7,7,7});
		System.out.println(x);
	}

}
