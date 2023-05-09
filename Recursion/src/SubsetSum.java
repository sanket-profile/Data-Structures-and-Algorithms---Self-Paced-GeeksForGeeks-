import java.util.ArrayList;

public class SubsetSum {

	public static void numSubsets(int[] arr, ArrayList<Integer> curr, int index , int sum) {
		int temp = 0;
		if(index == 0) {
			System.out.println(curr);
			return;
		}
		temp = arr[index-1];
		numSubsets(arr, curr, index-1, sum);
		curr.add(temp);
		numSubsets(arr, curr, index-1, sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {10,20,15};
		int sum = 20;
		ArrayList<Integer> curr = new ArrayList<>();
		numSubsets(arr, curr , 3, sum);
	}

}
