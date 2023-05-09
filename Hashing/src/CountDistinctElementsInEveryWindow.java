import java.util.HashMap;
import java.util.HashSet;

public class CountDistinctElementsInEveryWindow {

	public static void countDistinctElementsInEveryWindow(int[] arr , int k) {
		HashMap<Integer , Integer> map = new HashMap<>();
		int temp = 0;
		int posi = 0;
		for(int i = 0 ; i <= arr.length - k ; i++) {
			if(temp < k) {
				while(temp != k) {
					if(map.containsKey(arr[temp])) {
						map.put(arr[temp], map.get(arr[temp])+1);
					}else {
						map.put(arr[temp], 1);
					}
					temp++;
				}
				System.out.print(map.size() + " ");
			}else {
				if(map.containsKey(arr[posi])) {
					map.put(arr[posi], map.get(arr[posi]) - 1);
				}
				if(map.get(arr[posi]) == 0) {
					map.remove(arr[posi]);
				}
				posi++;
				if(map.containsKey(arr[i+k-1])) {
					map.put(arr[i+k-1], map.get(arr[i+k-1])+1);
				}else {
					map.put(arr[i+k-1], 1);
				}
				System.out.print(map.size() + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDistinctElementsInEveryWindow(new int[] {10,20,20,10,30,40,10}, 4);
	}

}
