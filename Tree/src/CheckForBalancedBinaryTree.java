
public class CheckForBalancedBinaryTree {

	public static int checkHeight(Node n) {
		if(n == null) {
			return 0;
		}else {
			return Math.max(checkHeight(n.left),checkHeight(n.right))+1;
		}
	}
	public static boolean checkForBalancedBinaryTree(Node n) {
		if(n!= null) {
			if(Math.abs(checkHeight(n.left) - checkHeight(n.right)) > 1) {
				return false;
			}else {
				return checkForBalancedBinaryTree(n.left) && checkForBalancedBinaryTree(n.right);
			}
		}
		return true;
	}
	
	public static boolean checkHeightBetter(Node n) {
		if(n == null) {
			return true;
		}else {
			return Math.max(checkHeight(n.left),checkHeight(n.right))+1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(50);
		root.left.right = new Node(30);
		root.right = new Node(40);
		root.right.left = new Node(40);
		root.left.right.left = new Node(40);
		root.left.right.right = new Node(40);
		boolean x = checkForBalancedBinaryTree(root) ;
		System.out.println(x);
	}

}
