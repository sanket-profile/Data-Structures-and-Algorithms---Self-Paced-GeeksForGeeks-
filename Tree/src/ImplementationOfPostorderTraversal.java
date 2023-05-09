
public class ImplementationOfPostorderTraversal {

	public static void implementationOfPostorderTraversal(Node n) {
		if(n != null) {
			implementationOfPostorderTraversal(n.left);
			implementationOfPostorderTraversal(n.right);
			System.out.print(n.data + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		implementationOfPostorderTraversal(root);
	}

}
