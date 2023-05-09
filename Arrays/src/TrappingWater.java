
public class TrappingWater {

	public static int trappedWater(int[] arr) {
		int[] lmax = new int[arr.length];
		int[] rmax = new int[arr.length];
		lmax[0] = arr[0];
		rmax[arr.length-1] = arr[arr.length-1];
		int water = 0;
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[i] > lmax[i-1]) {
				lmax[i] = arr[i];
			}else {
				lmax[i] = lmax[i-1];
			}
		}
		for(int i = arr.length-2 ; i >= 0 ; i--) {
			if(arr[i] > rmax[i+1]) {
				rmax[i] = arr[i];
			}else {
				rmax[i] = rmax[i+1];
			}
		}
		for(int i = 1 ; i < arr.length - 1 ; i++) {
			water = water + (Math.min(lmax[i], rmax[i]) - arr[i]);
		}
		
		return water;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = trappedWater(new int[] {1,2,3});
		System.out.println(x);
	}

}
