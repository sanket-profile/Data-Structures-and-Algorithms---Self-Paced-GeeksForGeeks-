import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Intervals{
	int x;
	int y;
	Intervals(int x , int y){
		this.x = x;
		this.y = y;
	}
}
class myComp implements Comparator<Intervals>{

	@Override
	public int compare(Intervals o1, Intervals o2) {
		// TODO Auto-generated method stub
		return o1.x - o2.x;
	}
	
}
public class MergeOverlappingIntervals {

	public static ArrayList<Intervals> mergeOverlappingIntervals(ArrayList<Intervals> arr){
		ArrayList<Intervals> merged = new ArrayList<>();
		Collections.sort(arr, new myComp());
		int i = 0;
		int maxY = 0;
		int minX = 0;
		boolean flag = false;
		while(i < arr.size()-1) {
			if(arr.get(i).y >= arr.get(i+1).x) {
				minX = arr.get(i).x;
				maxY = arr.get(i).y;
				while(maxY >= arr.get(i+1).x) {
					maxY = Math.max(maxY, arr.get(i+1).y);
					if(i == arr.size() -2) {
						flag = true;
						break;
					}
					i++;
				}
				i++;
				merged.add(new Intervals(minX, maxY));
			}else {
				minX = arr.get(i).x;
				maxY = arr.get(i).y;
				merged.add(new Intervals(minX, maxY));
				i++;
			}
		}
		if(flag != true) {
			merged.add(arr.get(arr.size()-1));
		}
		return merged;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Intervals> arr = new ArrayList<>();
		arr.add(new Intervals(1, 3));
		arr.add(new Intervals(2, 4));
		arr.add(new Intervals(5, 7));
		arr.add(new Intervals(6, 8));
		ArrayList<Intervals> x = mergeOverlappingIntervals(arr);
		for(int i = 0 ; i < x.size() ; i++) {
			System.out.println(x.get(i).x + "  " + x.get(i).y);
		}
	}

}
