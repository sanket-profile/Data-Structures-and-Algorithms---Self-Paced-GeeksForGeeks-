import java.util.HashMap;

public class MoreThanNKOccurences {

	public static void moreThanNKOccurences(int[] arr , int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i < arr.length ; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		for(int i : map.keySet()) {
			if(map.get(i) > arr.length/k) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moreThanNKOccurences(new int[] {30,10,20,30,30,40,30,40,30}, 2);
	}

}
