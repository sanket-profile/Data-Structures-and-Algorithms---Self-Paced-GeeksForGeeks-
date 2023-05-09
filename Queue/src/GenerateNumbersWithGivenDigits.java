import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateNumbersWithGivenDigits {

	public static void generateNumbersWithGivenDigits(int n) {
		Queue<String> queue = new ArrayDeque<>();
		queue.offer("5");
		queue.offer("6");
		for(int i = 0 ; i < n ; i++) {
			String nums = queue.remove();
			System.out.println(nums + " ");
			queue.offer(nums+"5");
			queue.offer(nums+"6");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateNumbersWithGivenDigits(10);
	}

}
