import java.util.Arrays;

public class MeetingTheMaximumGuests {

	public static int maxGuests(int[] arr , int[] dept) {
		int res = 0;
		int count = 0;
		int come = 0;
		int go = 0;
		Arrays.sort(arr);
		Arrays.sort(dept);
		while(come + go < arr.length + dept.length) {
			if(come == arr.length) {
				go++;
				count--;
			}else if(go == dept.length) {
				come++;
				count++;
			}else if(arr[come] == dept[go]){
				go++;
				come++;
			}else if(arr[come] < dept[go]) {
				count++;
				come++;
			}else {
				count--;
				go++;
			}
			res = Math.max(count, res);
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = maxGuests(new int[] {900,600,700}, new int[] {1000,800,730});
		System.out.println(x);
	}

}
