import java.util.ArrayDeque;
import java.util.Queue;

public class PrintLeftViewOfBinaryTree {

	public static void printLeftViewOfBinaryTree(Node n) {
		Node first = null;
		int size = 0;
		int count = -1;
		boolean flag = true;
		Queue<Node> q = new ArrayDeque<>();
		q.offer(n);
		System.out.print(n.data + " ");
		while(!q.isEmpty()) {
			first = q.poll();
			if(first.left != null) {
				q.offer(first.left);
			}
			if(first.right != null) {
				q.offer(first.right);
			}
			count++;
			if(count == size && q.isEmpty() == false) {
				System.out.print(q.peek().data + " ");
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
		Node root = new Node(30);
		root.right = new Node(50);
		root.right.left = new Node(60);
		root.right.left.right = new Node(10);
		printLeftViewOfBinaryTree(root);
	}

}
