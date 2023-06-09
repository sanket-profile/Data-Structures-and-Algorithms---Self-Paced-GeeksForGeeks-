
public class CheckForBalancedBinaryTree {
	static int output = 0;
	public static int checkForBalancedBinaryTree(Node n) {
		if(n!= null) {
			if(Math.abs(checkForBalancedBinaryTree(n.left) - checkForBalancedBinaryTree(n.right)) > 1) {
				output = -1;
				return Math.max(checkForBalancedBinaryTree(n.left), checkForBalancedBinaryTree(n.right)) + 1;
			}else {
				return Math.max(checkForBalancedBinaryTree(n.left), checkForBalancedBinaryTree(n.right)) + 1;
			}
		}else {
			return 0;
		}
	}
	
 /*                                        75
    
                        100                             49

           87                        8          11                    50

63              100           26
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(75);
		root.left = new Node(100);
		root.left.left = new Node(87);
		root.left.right = new Node(8);
		root.right = new Node(49);
		root.right.left = new Node(11);
		root.right.right = new Node(50);
		root.left.right.left = new Node(26);
		root.left.left.left = new Node(63);
		root.left.left.right = new Node(100);
		int x = checkForBalancedBinaryTree(root) ;
		System.out.println(x);
		System.out.println(output);
	}

}
