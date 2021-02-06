package BinarySearchTree;

import BinaryTree.BinaryTree;
import BinaryTree.LevelOrderTraversal;
import BinaryTree.Node;
import java.util.*;

public class binarytreetobalancedBST extends LevelOrderTraversal {
	
	static List<Node> l=new ArrayList<Node>();
	
	/*
	 * Time Complexity O(N) and Space O(N)
	 */
	
	
	static Node binarytreetobalancedBST(Node root) {
		utility(root);
		return construct(0,l.size()-1);
	}
	
	static void utility(Node root) {
		if(root==null) return;
		
		utility(root.left);
		l.add(root);
		utility(root.right);
		
	}
	
	static Node construct(int start,int end) {
		if(start>end) return null;
		int mid=start+(end-start)/2;
		
		Node root=l.get(mid);
		root.left=construct(start,mid-1);
		root.right=construct(mid+1,end);
		
		return root;
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree(); 		  
        /*create root*/
        tree.root = new Node(10); 
        tree.root.left = new Node(21); 
        tree.root.right = new Node(13);  
        tree.root.left.left = new Node(14); 
        tree.root.left.left.right = new Node(19);
        
        System.out.println("Before");
        System.out.println(LevelOrderTraversal(tree.root));
        
        
        System.out.println("After");
        binarytreetobalancedBST(tree.root);
        System.out.println(LevelOrderTraversal(tree.root));
        
        
        
	}

}
