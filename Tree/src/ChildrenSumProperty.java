
public class ChildrenSumProperty {

	public static boolean childrenSumProperty(Node n) {
		int sum = 0;
		if(n == null) {
			return true;
		}
		if(n.left == null && n.right == null) {
			return true;
		}
		if(n.left != null) {
			sum += n.left.data;
		}
		if(n.right != null) {
			sum += n.right.data;
		}
		return (n.data == sum && childrenSumProperty(n.left) && childrenSumProperty(n.right));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(5);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		System.out.println(childrenSumProperty(root));
	}

}
