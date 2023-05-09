
public class StockBuySell {

	public static int maxProfit(int[] arr) {
		int profit = 0;
		int i = 0;
		int buy = -1;
		int sell = -1;
		while(i <= arr.length - 2) {
			if(arr[i] < arr[i+1]) {
				buy = i;
				while(arr[i] < arr[i+1]) {
					i++;
					if(i == arr.length - 1) {
						break;
					}
				}
				sell = i;
				profit += arr[sell] - arr[buy]; 
				}
			i++;

		}
		return profit;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = maxProfit(new int[] {1,5,3,1,2,8});
		System.out.println(x);
	}

}
