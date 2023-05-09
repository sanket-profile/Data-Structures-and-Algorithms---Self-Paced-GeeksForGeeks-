
public class HeightOfBinaryTree {

	public static int heightOfBinaryTree(Node n) {
		if(n != null) {
			return Math.max(heightOfBinaryTree(n.left), heightOfBinaryTree(n.right)) + 1;
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(30);
		root.left.left.left = new Node(40);
		root.right = new Node(50);
		int x = heightOfBinaryTree(root) ;
		System.out.println(x);
	}

}
