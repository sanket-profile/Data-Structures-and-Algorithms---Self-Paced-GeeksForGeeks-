
public class MaximumInBinaryTree {

	public static int maximumInBinaryTree(Node n) {
		if(n != null) {
			int max = Math.max(maximumInBinaryTree(n.left), maximumInBinaryTree(n.right));
			return Math.max(max, n.data);
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		System.out.println(maximumInBinaryTree(root));
	}

}
