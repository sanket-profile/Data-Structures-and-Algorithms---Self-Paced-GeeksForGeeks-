
public class RemoveDuplicates {

	public static int removeDups(int[] arr) {
		int dups = 0;
		int count = 0;
		for(int i = 0 ; i < arr.length -1 ; i++) {
			if(arr[i] != arr[i+1]) {
				dups = i+1;
				arr[dups] = arr[i+1];
				
				count++;
			}
	}
		return count +1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = removeDups(new int[] {10,45,20,20,30,30,30,30});
		System.out.println(x);
	}

}
