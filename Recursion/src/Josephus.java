import java.util.Arrays;

public class Josephus {
	
	public static int josephus(int n , int k ) {
	/*	int count = 0;
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = i;
		} 
		int temp = 0;
		int temp1 = k;
		while(count != n-1) {
			while(temp1!=0) {
				if(arr[temp] != -1) {
					temp1--;
				}
				temp++;
				if(temp == n) {
					temp = 0;
				}
			}
			if(temp == 0) {
				temp = n -1;
			}else {
				temp--;
			}
			temp1 = k;
			arr[temp] = -1;
			count++;
		}
		Arrays.sort(arr);
		
		return arr[arr.length-1];
	*/	
		
		if(n == 1) {
			return 0;
		}else {
			return (josephus(n-1, k)+k)%n;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = josephus(5, 3);
		System.out.println(x);
	}

}
