package BinaryTree;

import java.util.*;
public class LeftSideView {
	
	
	/*
	 * Time Complexity O(N),N-number of nodes
	 * Space Complexity O(N),N- number of nodes
	 */
	
	
	static List<Integer> LeftSideView(Node root){
		List<Integer> result=new ArrayList<>();
		if(root==null) return result;
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int size=queue.size();
			for(int i=0;i<size;i++) {
				Node current=queue.remove();
				if(i==0) {
					result.add(current.val);
				}
				if(current.left!=null) {
					queue.add(current.left);
				}
				if(current.right!=null) {
					queue.add(current.right);
				}
			}
		}
		return result;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				BinaryTree tree = new BinaryTree(); 
				  
		        /*create root*/
		        tree.root = new Node(1); 
		  
		        /* following is the tree after above statement 
		  
		              1 
		            /   \ 
		          null  null     */
		  
		        tree.root.left = new Node(2); 
		        tree.root.right = new Node(3); 
		  
		        /* 2 and 3 become left and right children of 1 
		               1 
		             /   \ 
		            2      3 
		          /    \    /  \ 
		        null null null null  */
		  
		  
		        tree.root.left.left = new Node(4); 
		        /* 4 becomes left child of 2 
		                    1 
		                /       \ 
		               2          3 
		             /   \       /  \ 
		            4    null  null  null 
		           /   \ 
		          null null 
		         */
				
		        System.out.println(LeftSideView(tree.root));


	}

}
