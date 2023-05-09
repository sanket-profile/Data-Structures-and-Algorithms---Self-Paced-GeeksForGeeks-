import java.util.HashSet;

public class CountDistinctElements {

	public static int numDistinctElements(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0 ; i < arr.length ; i ++) {
			set.add(arr[i]);
		}
		return set.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = numDistinctElements(new int[] {15,12,13,12,13,13,18});
		System.out.println(x);
	}

}
