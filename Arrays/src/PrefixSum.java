
public class PrefixSum {

	public static int getSum(int[] arr , int l , int r) {
		int sum = 0;
		int[] arrweighted = new int[arr.length];
		int[] arrweighted1 = new int[arr.length];
		for(int i = 0 ; i < arr.length ; i++) {
			sum = sum + ((i+1)*arr[i]);
			arrweighted[i] = sum;
		}
		for(int i = 0 ; i < arr.length ; i++) {
			sum = sum + arr[i];
			arrweighted1[i] = sum;
		}
		sum = 0;
		if(l == 0) {
			sum = arrweighted[r] - ((l-1)*(arrweighted1[r] - arrweighted1[r]));
		}else {
			sum = arrweighted[r] - arrweighted[l-1] - ((l)*(arrweighted1[r] - arrweighted1[l-1]));
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = getSum(new int[] {2,3,5,4,6,1}, 2, 3);
		System.out.println(x);
	}

}
