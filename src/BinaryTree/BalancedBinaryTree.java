package BinaryTree;

import java.util.*;
public class BalancedBinaryTree {
	
	/*
	 * Time complexity O(N) space O(h)
	 */
	
	static boolean balancedBinaryTree(Node root) {
		if(root==null) return true;
		
		return Math.abs(getDepth(root.left)-getDepth(root.right))<=1 && balancedBinaryTree(root.left) && balancedBinaryTree(root.right) ? true:false ;
	}
	
	static int getDepth(Node root) {
		if(root==null) return 0;
		return Math.max(getDepth(root.left),getDepth(root.right))+1;
	}

	public static void main(String[] args) {
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
		System.out.println(balancedBinaryTree(tree.root));


	}

}
