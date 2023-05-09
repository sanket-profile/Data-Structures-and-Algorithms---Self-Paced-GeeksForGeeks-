
public class SecondLargest {

	public static int secondLargest(int[] arr) {
		int largest = 0;
		int nextLargest = 0;
		int index = -1;
		int nextIndex = -1;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > largest) {
				nextLargest = largest;
				nextIndex = index;
				index = i;
				largest = arr[i];
			}
		}
		return nextIndex;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = secondLargest(new int[] {6,6,6,6,6,6});
		System.out.println(x);
	}

}
