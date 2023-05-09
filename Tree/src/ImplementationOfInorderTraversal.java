class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}
public class ImplementationOfInorderTraversal {
	
	public static void implementationOfInorderTraversal(Node n) {
		if(n != null) {
			implementationOfInorderTraversal(n.left);
			System.out.print(n.data + " ");
			implementationOfInorderTraversal(n.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		implementationOfInorderTraversal(root);
	}

}
