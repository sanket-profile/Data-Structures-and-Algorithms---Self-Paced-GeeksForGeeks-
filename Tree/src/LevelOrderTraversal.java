import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void levelOrderTraversal(Node n) {
		Node first = null;
		Queue<Node> q = new ArrayDeque<>();
		if(n != null) {
			q.offer(n);
		}else {
			return;
		}
		while(!q.isEmpty()) {
			first = q.poll();
			System.out.print(first.data + " ");
			if(first.left != null) {
				q.offer(first.left);
			}
			if(first.right != null) {
				q.offer(first.right);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		levelOrderTraversal(root);
	}

}
