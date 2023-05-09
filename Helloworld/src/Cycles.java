import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Cycles 
{ 
	static int numCycles(int V , ArrayList<ArrayList<Integer>> graph) {
		int cycle = 0;
		int tempVertex = 0;
		int[] arr = new int[V];
		for(int i = 0 ; i < V ; i++) {
			arr[i] = -1;
		}
		for(int i = 0 ; i < V ; i++) {
			for(int j = 0 ; j < graph.get(i).size() ; j ++) {
				tempVertex = graph.get(i).get(j);
				if(tempVertex > i) {
					if(arr[tempVertex] == arr[i] && arr[i] != -1) {
						cycle += 1;
					}else if(arr[tempVertex] == arr[i]) {
						arr[i] += arr[tempVertex];
						arr[tempVertex] = i;
					}else if(arr[tempVertex] > arr[i]) {
						arr[tempVertex] += arr[i];
						arr[i] = tempVertex;
					}
				}
			}
		}
	    return cycle;
	}





    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);  
    	System.out.print("Enter the number of elements you want to store: ");  
    	int n=sc.nextInt();  
        int[] Arr = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
  {  
        	Arr[i]=sc.nextInt();  
  }  

        int maxSpecialSubarrays = maxSpecialSubarrays(Arr);
        System.out.println(maxSpecialSubarrays);
    }
}