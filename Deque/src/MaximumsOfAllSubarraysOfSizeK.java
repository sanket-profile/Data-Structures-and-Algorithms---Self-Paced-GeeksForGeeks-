import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumsOfAllSubarraysOfSizeK {

	public static void maximumsOfAllSubarraysOfSizeK(int[] arr , int k) {
		Deque<Integer> d = new ArrayDeque<>();
		for(int i = 0 ; i < k ; i++) {
			while(d.isEmpty() == false && arr[d.peekLast()] < arr[i]) {
				d.pollLast();
			}
			d.offerLast(i);
		}
		for(int i = k ; i < arr.length ; i++) {
			System.out.println(arr[d.peekFirst()]);
			while(d.isEmpty() == false && d.peekFirst() <= i-k) {
				d.pollFirst();
			}
			while(d.isEmpty() == false && arr[d.peekLast()] < arr[i]) {
				d.pollLast();
			}
			d.offerLast(i);
		}
		System.out.println(arr[d.peekFirst()]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maximumsOfAllSubarraysOfSizeK(new int[] {20,40,30,10,60}, 3);
	}

}
