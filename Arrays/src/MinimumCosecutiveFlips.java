
public class MinimumCosecutiveFlips {

	public static void minimumConsecutiveFlips(int[] arr) {
		int to = -1;
		int from = -1;
		for(int i = 0 ; i < arr.length -1 ; i++) {
				if(arr[i] != arr[i+1]) {
					if(from == -1) {
						from = i+1;
					}else {
						to = i;
					}
				}else if(arr[i] != arr[i+1] && from != -1) {
					to = i+1;
				}else if(arr[i] == arr[i+1] && from != -1 && i+1 == arr.length-1) {
					to = i+1;
				}
				if(to != -1 && from != -1) {
					System.out.println("From " + from + " to " + to);
					from = -1;
					to = -1;
				}
		}
		if(arr.length >1 ) {
			if(arr[arr.length-1] + arr[arr.length -2] == 1) {
				from = arr.length - 1;
				System.out.println("From " + from + " to " + from);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minimumConsecutiveFlips(new int[] {1,1,1,1});
	}

}
