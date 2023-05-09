import java.util.ArrayList;

public class LeaderInArray {

	public static void leaders(int[] arr) {
		int[] leader_arr = new int[arr.length];
		ArrayList<Integer> newleader = new ArrayList<>();
		leader_arr[0] = arr[arr.length-1];
		int pointer = 1;
		int curr_leader = arr[arr.length-1];
		for(int i = arr.length -2 ; i >=0 ; i--) {
			if(curr_leader < arr[i]) {
				leader_arr[pointer] = arr[i];
				curr_leader = arr[i];
				pointer++;
			}else {
				leader_arr[pointer] = -1;
				pointer++;
			}
		}
		for(int i = arr.length -1 ; i >=0 ; i--) {
			if(leader_arr[i] != -1) {
				newleader.add(leader_arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leaders(new int[] {7,10,4,10,6,5,2});
	}

}
