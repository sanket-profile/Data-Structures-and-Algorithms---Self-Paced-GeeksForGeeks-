
public class SearchInSortedRotatedArray {

	public static int binarySearch(int[] arr , int k , int low , int high) {
		int mid = -1;
		while(low < high) {
			mid = (low+high)/2;
			if(arr[mid] == k) {
				return mid;
			}else if(arr[mid] > k) {
				if(mid == 0 || arr[mid-1] == k) {
					return mid-1;
				}else {
					high = mid-1;
				}
			}else {
				if(mid == arr.length-1 || arr[mid+1] == k) {
					return mid+1;
				}else {
					low = mid+1;
				}
			}
		}
		return -1;
	}
	public static int reversebinarySearch(int[] arr , int k , int low , int high) {
		int mid = -1;
		while(low < high) {
			mid = (low+high)/2;
			if(arr[mid] == k) {
				return mid;
			}else if(arr[mid] < k) {
				if(mid == 0 || arr[mid-1] == k) {
					return mid-1;
				}else {
					high = mid-1;
				}
			}else {
				if(mid == arr.length-1 || arr[mid+1] == k) {
					return mid+1;
				}else {
					low = mid+1;
				}
			}
		}
		return -1;
	}
	
	public static int findBoundary(int[] arr , int k) {
		int low = 0;
		int high =arr.length-1;
		int boundary = -1;
		if(arr.length == 1) {
			if(arr[0] == k) {
				return 0;
			}else {
				return -1;
			}
		}
		if(arr[0] <= arr[arr.length-1]) {
			low = 0;
			high = arr.length-1;
			return binarySearch(arr, k, low, high);
		}else {
			if(arr.length > 1) {
				if(arr[0] > arr[1]) {
					boundary = 0;
					if(arr[0] == k) {
						return 0;
					}else {
						high = arr.length-1;
						return reversebinarySearch(arr, k, 1, high);
					}
				}else {
					boundary = 1;
					low = 1;
					while(low < high) {
						if(arr[boundary] >= arr[low]) {
							if(arr[boundary] > arr[boundary+1]) {
								if(arr[boundary] == k) {
									return boundary;
								}else if(arr[boundary] > k) {
									if(binarySearch(arr, k, 0, boundary) == -1) {
										if(binarySearch(arr, k, boundary, arr.length-1) == -1) {
											return -1;
										}else {
											return binarySearch(arr, k, boundary, arr.length-1);
										}
									}else {
										return binarySearch(arr, k, 0, boundary);
									}
								}else {
									return -1;
								}
							}else {
								low = boundary;
								boundary = (low+high)/2;
							}
						}else {
							if(arr[boundary] < arr[boundary-1]) {
								if(arr[boundary] == k) {
									return boundary;
								}else if(arr[boundary] > k) {
									return -1;
								}else {
									if(binarySearch(arr, k, boundary, arr.length-1) == -1) {
										if(binarySearch(arr, k, 0, boundary) == -1) {
											return -1;
										}else {
											return binarySearch(arr, k, 0, boundary);
										}
									}else {
										return binarySearch(arr, k, boundary, arr.length-1);
									}
								}
							}else {
								high = boundary;
								boundary = (low+high)/2;
							}
						}
					}
				}
			}
		}
		return boundary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = findBoundary(new int[] {100,90,80,70,60,50},50);
		System.out.println(x);
	}

}
