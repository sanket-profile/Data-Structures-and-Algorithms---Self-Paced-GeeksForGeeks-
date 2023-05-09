
public class RepeatingElement {

	public static int repeatingElement(int[] arr) {
		int slow = arr[0] + 1;
		int fast = arr[0] + 1;
		do {
			slow = arr[slow] + 1;
			fast = arr[arr[fast]] + 1;
		}while(slow != fast);
		slow = arr[0] + 1;
		while(slow != fast) {
			slow = arr[slow] + 1;
			fast = arr[fast] + 1;
		}
		return slow - 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = repeatingElement(new int[] {1,3,2,4,3,3});
		System.out.println(x);
	}

}
