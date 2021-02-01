package BinarySearchTree;

import BinaryTree.BinaryTree;
import BinaryTree.Node;

public class LowestCommonAncestorofBST extends SearchNInsertBST {

	
	/*
	 * Time complexity O(N) space O(N)
	 */
	
	
	public static int LowestCommonAncestorofBST(Node root,Node p,Node q) {
		
		if(p.val < root.val && q.val<root.val) {
			return LowestCommonAncestorofBST(root.left,p,q);
		}
		else if(p.val > root.val && q.val > root.val) {
			return LowestCommonAncestorofBST(root.right,p,q);
		}
	else {
		return root.val;
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
        
        System.out.println(LowestCommonAncestorofBST(tree.root,tree.root.left.left,tree.root.left.right));

	}

}
