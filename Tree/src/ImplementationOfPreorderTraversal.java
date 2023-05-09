
public class ImplementationOfPreorderTraversal {

	public static void implementationOfPreorderTraversal(Node n) {
		if(n != null) {
			System.out.print(n.data + " ");
			implementationOfPreorderTraversal(n.left);
			implementationOfPreorderTraversal(n.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		implementationOfPreorderTraversal(root);
	}

}
