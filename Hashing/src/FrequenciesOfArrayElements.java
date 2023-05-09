import java.util.HashMap;

public class FrequenciesOfArrayElements {

	public static void frequencies(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int temp = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(map.containsKey(arr[i])) {
				temp = map.get(arr[i]);
				map.put(arr[i], temp+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequencies(new int[] {10,12,10,15,10,20,12,12});
		
	}

}
