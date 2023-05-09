import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversalLineByLinePart1 {

	public static void levelOrderTraversalLineByLinePart1(Node n) {
		Node first = null;
		boolean flag = true;
		int size = 0;
		int count = -1;
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
			count++;
			if(count == size) {
				System.out.println();
				count = 0;
				flag = true;
			}
			if(flag) {
				size = q.size();
				flag = false;
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
		levelOrderTraversalLineByLinePart1(root);
	}

}
