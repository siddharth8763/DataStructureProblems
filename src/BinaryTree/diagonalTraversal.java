package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class diagonalTraversal {
	
	/*
	 * Time and space complexity O(N)
	 */
	
	static List<Integer> diagonalTraversal(Node root) {
		List<Integer> answer = new ArrayList<Integer>();
		Queue<Node> queue= new LinkedList<Node>();
		if(root==null) return answer;
		queue.add(root);
		while(!queue.isEmpty()) {
			Node temp=queue.peek();
			queue.poll();
			while(temp!=null) {
				if(temp.left != null) {
					queue.add(temp.left);
				}
				answer.add(temp.val);
				temp=temp.right;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Node root = new Node(8);
	        root.left = new Node(3);
	        root.right = new Node(10);
	        root.left.left = new Node(1);
	        root.left.right = new Node(6);
	        root.right.right = new Node(14);
	        root.right.right.left = new Node(13);
	        root.left.right.left = new Node(4);
	        root.left.right.right = new Node(7);
	        
	        System.out.println(diagonalTraversal(root));
	        
	}

}
