package BinarySearchTree;

import BinaryTree.BinaryTree;
import BinaryTree.Node;

public class validBST extends SearchNInsertBST {
	
	
	/*
	 * Time Complexity O(N) and Space O(N)
	 */
	
	public static boolean validBST(Node root) {
		return validBSTutility(root,null,null);
	}
	
	public static boolean validBSTutility(Node root,Integer max,Integer min) {
		if(root==null) {
			return true;
		}
		else if(max!=null && root.val>=max || min!=null && root.val<=min) {
			return false;
		}
		else {
			return validBSTutility(root.left,root.val,min) && validBSTutility(root.right,max,root.val);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree(); 
		  
        /* Let us create following BST 
              50 
           /     \ 
          30      70 
         /  \    /  \ 
       20   40  60   80 */
        tree.root=new Node(50);
        insertinBST(tree.root,30);
        insertinBST(tree.root,70);
        insertinBST(tree.root,20);
        insertinBST(tree.root,40);
        insertinBST(tree.root,60);
        insertinBST(tree.root,80);
        
        System.out.println(validBST(tree.root));

	}

}
