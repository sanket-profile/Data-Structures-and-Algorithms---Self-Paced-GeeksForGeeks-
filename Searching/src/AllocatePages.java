
public class AllocatePages {

	public static int minPages(int[] arr , int k) {
		int high = 0;;
		int low = -1;
		int mid = 0;
		int res = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			high += arr[i];
			low = Math.max(low, (arr[i] >= low)? arr[i] : low);
		}
		while(low <= high) {
			mid = (low+high)/2;
			if(canBePartitioned(arr, k, mid)) {
				high = mid-1;
				res = mid;
			}else {
				low = mid+1;
			}
		}
		return res;
	}
	
	public static boolean canBePartitioned(int[] arr ,int k , int mid) {
		boolean ans = false;
		int sum = 0;
		int partitions = 1;
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
			if(sum == mid) {
				partitions ++;
				sum = 0;
			}else if(sum > mid) {
				partitions++;
				sum =arr[i];
			}
		}
		if(partitions <= k) {
			return true;
		}else {
			return ans;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = minPages(new int[] {10,20,10,30}, 2);
		System.out.println(x);
	}

}
