import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MoreThanNKOccurencesONKSolution {

	public static int moreThanNKOccurencesONKSolution(int[] arr , int k) {
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i < arr.length ; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else if(map.size() < k - 1) {
				map.put(arr[i], 1);
			}else {
				for(Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator(); it.hasNext(); ) {
				    Map.Entry<Integer, Integer> entry = it.next();
				    map.put(entry.getKey(), entry.getValue()-1);
				    if(entry.getValue() == 0) {
				        it.remove();
				    }
				}
			}
		}
		for(int i : map.keySet()) {
			map.put(i, 0);
			for(int j = 0 ; j < arr.length ; j++) {
				if(arr[j] == i) {
					map.put(i, map.get(i)+1);
				}
			}
			if(map.get(i) > arr.length/k) {
				count += 1;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = moreThanNKOccurencesONKSolution(new int[] {1,2,2}, 2);
		System.out.println(x);
		
	}

}
