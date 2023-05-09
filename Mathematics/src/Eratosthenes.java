import java.util.Arrays;

public class Eratosthenes {
	
	public static void seive(int n) {
		int temp =0;
		boolean[] arr = new boolean[n+1];
		Arrays.fill(arr, true);
		for(int i = 2 ; i < Math.pow(n, 0.5) ; i++) {
			temp = i + i;
			if(arr[i]) {
				while(temp <= n) {
					arr[temp] = false;
					temp += i;
				}
			}
		}
		for(int i = 2 ; i <= n ; i++) {
			if(arr[i]) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seive(12);
	}

}
