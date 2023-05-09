
public class SizeOfBinaryTree {

	static int count = 0;
	public static void sizeOfBinaryTree(Node n) {
		if(n != null) {
			count ++;
			sizeOfBinaryTree(n.left);
			sizeOfBinaryTree(n.right);
		}
	}
	public static int sizeOfBinaryTreeBetter(Node n) {
		if(n == null) {
			return 0;
		}else {
			return 1 + sizeOfBinaryTreeBetter(n.left)+ sizeOfBinaryTreeBetter(n.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		int x = sizeOfBinaryTreeBetter(root);
		System.out.println(x);
	}

}
