import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author sanketsaxena
 *
 */
public class hello1 {

	/**
	 * @param arcs
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] graph = graphCreate(5, 4);
		//printGraph(graph);
		ArrayList<ArrayList<Integer>> graphlistImpl = graphListImpl(5, 4);
		printGraphListImpl(graphlistImpl);

	}
	private static int[][] graphCreate(int vertices , int edges) {
		int fvertex = 0;
		int svertex = 0;
		Scanner sc = new Scanner(System.in);
		int[][] graph = new int[vertices][vertices];
		for(int i =0 ; i < edges ; i++) {
			System.out.println("Enter the vertices for edge : " + i);
			System.out.println("Enter 1st vertex");
			fvertex = sc.nextInt();
			System.out.println("Enter 2nd vertex");
			svertex = sc.nextInt();
			graph[fvertex][svertex] = 1;
			graph[svertex][fvertex] = 1;
		}
		return graph;
	}
	private static void printGraph(int[][] graph) {
		for(int i = 0 ; i < graph.length ; i++) {
			for(int j = 0 ; j < graph.length ;j++) {
				System.out.print(graph[i][j] + "  ");
			}
			System.out.println("");
		}
	}
	private static ArrayList<ArrayList<Integer>> graphListImpl(int vertices , int edges){
		int fvertex = 0;
		int svertex = 0;
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(vertices);
		Scanner sc = new Scanner(System.in);
		for(int i =0 ; i < vertices ; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for(int i = 0 ; i < edges ; i++) {
			System.out.println("Enter the vertices for edge : " + i);
			System.out.println("Enter 1st vertex");
			fvertex = sc.nextInt();
			System.out.println("Enter 2nd vertex");
			svertex = sc.nextInt();
			graph.get(fvertex).add(svertex);
			graph.get(svertex).add(fvertex);
		}
		return graph;	
	}
	private static void printGraphListImpl(ArrayList<ArrayList<Integer>> graph) {
		for(int i = 0 ; i < graph.size(); i++) {
			System.out.print(i + "->");
			for(int j = 0 ; j < graph.get(i).size() ; j++) {
				System.out.print(graph.get(i).get(j) + "->");
			}
			System.out.println("");
		}
	}
}
