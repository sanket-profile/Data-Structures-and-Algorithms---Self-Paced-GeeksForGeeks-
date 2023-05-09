
public class PrintNodesAtKDistance {

	public static void printNodesAtKDistance(Node n , int k , int distance) {
		if(distance == k && n != null) {
			System.out.print(n.data + " ");
			return;
		}
		if(n == null) {
			return ;
		}else {
			printNodesAtKDistance(n.left, k, distance+1);
			printNodesAtKDistance(n.right, k, distance+1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.right = new Node(70);
		printNodesAtKDistance(root,2,0);
	}

}
