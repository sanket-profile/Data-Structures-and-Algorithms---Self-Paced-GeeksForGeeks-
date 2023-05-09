
public class FirstCircularTour {

	public static int firstCircularTour(int[] petrolArr , int[] distanceArr) {
		int petrol = 0;
		int temp = 0;
		int count = 0;
		for(int i = 0 ; i < petrolArr.length ; i++) {
			petrol = petrolArr[i];
			temp = i;
			count = 0;
			while(petrol >= distanceArr[temp] && count != petrolArr.length) {
				petrol = petrol - distanceArr[temp];
				temp = (temp+1)%petrolArr.length;
				count++;
				petrol += petrolArr[temp];
			}
			if(count == petrolArr.length) {
				return i+1;
			}
		}
		return -1;
	}
	
	public static int firstCircularTourFastest(int[] petrolArr , int[] distanceArr) {
		int previousPetrol = 0;
		int currPetrol = 0;
		int start = 0;
		for(int i = 0 ; i < petrolArr.length ; i++) {
			currPetrol += (petrolArr[i] - distanceArr[i]);
			if(currPetrol < 0) {
				start = i+1;
				previousPetrol = currPetrol;
				currPetrol = 0;
			}
		}
		return (currPetrol + previousPetrol >= 0) ? start+1 : -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = firstCircularTourFastest(new int[] {50,10,60,100}, new int[] {30,20,100,10});
		System.out.println(x);
	}

}
