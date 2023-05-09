
public class ZeroToEnd {

	public static void swap(int[] arr , int a , int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void move0ToEnd(int[] arr) {
		int start= 0;
		int end = 0;
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == 0) {
				if(start == 0 && count == 0) {
					start = i;
				}else {
					end = i;
				}
			}else {
				swap(arr , i , start);
				start++;
				end++;
			}
			count++;
			
		}
		for(int j = 0 ; j < arr.length ; j++) {
			System.out.println(arr[j]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		move0ToEnd(new int[] {2,2,2,2,0,0,0,0});
	}

}
