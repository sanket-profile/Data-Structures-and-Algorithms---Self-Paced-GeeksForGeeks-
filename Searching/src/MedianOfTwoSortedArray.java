
public class MedianOfTwoSortedArray {

	public static double medianOfTwoSortedArray(int[] arr1 , int[] arr2) {
		double median = 0;
		int first = 0;
		int second = 0;
		double last = -1;
		double secondLast = -1;
		int newlength = (arr1.length +arr2.length)/2;
		int count =0;
		while(count != newlength +1) {
			if(first == arr1.length) {
				secondLast = last;
				last = arr2[second];
				second++;
				count++;
			}else if(second == arr2.length) {
				secondLast = last;
				last = arr1[first];
				first++;
				count++;
			}else if(arr1[first] == arr2[second]) {
				last = arr1[first];
				secondLast = arr2[second];
				first++;
				second++;
				count += 2;
			}else if(arr1[first] < arr2[second]) {
				secondLast = last;
				last = arr1[first];
				first++;
				count++;
			}else if(arr1[first] > arr2[second]) {
				secondLast = last;
				last = arr2[second];
				second++;
				count++;
			}
		}
		if((arr1.length+arr2.length)%2 == 0) {
			median = (last+secondLast)/2;
		}else {
			median =last;
		}
		return median;
	}
	
	public static double medianUsingBinarySearch(int[] arr1 , int[] arr2) {
		double median = 0;
		int low = 0;
		int high = arr1.length-1;
		int i1 = 0;
		int i2 = 0;
		int min1 = 0;
		int max1=0;
		int min2 = 0;
		int max2=0;
		while(low <= high) {
			i1 = (low+high)/2;
			i2 = ((arr1.length+arr2.length+1)/2) -i1;
			System.out.println(i2 + " " + low + " " + high + " " + i1);
			min1 = (i1 == arr1.length-1) ? Integer.MAX_VALUE : arr1[i1];
			max1 = (i1 == 0) ? Integer.MIN_VALUE : arr1[i1-1];
			min2 = (i2 == arr2.length-1) ? Integer.MAX_VALUE : arr2[i2];
			max2 = (i2 == 0) ? Integer.MIN_VALUE : arr2[i2-1];
			if(max1 <= min2 && min1 >= max2) {
				if((arr1.length+arr2.length)%2 == 0) {
					return (Math.max(max1, max2)+Math.min(min1, min2))/2;
				}else {
					return Math.max(max1, max2);
				}
			}else if(max1 > min2) {
				high = i1 -1;
			}else {
				low = i1+1;
			}
		}
		return median;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = medianUsingBinarySearch(new int[] {1,3}, new int[] {2});
		System.out.println(x);
	}

}
