
public class Frequencies {

	public static void countFrequencies(int[] arr) {
		int count = 1;
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[i] != arr[i-1]) {
				System.out.println(arr[i-1] + " - " + count);
				count = 1;
			}else {
				count++;
			}
		}
		System.out.println(arr[arr.length-1] + " - " + count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countFrequencies(new int[] {1,2,3});
	}

}
