package BinarySearchTree;

import BinaryTree.BinaryTree;
import BinaryTree.Node;

public class countNodesinGivenRange extends SearchNInsertBST {
	
	/*
	 * High and low are inclusive
	 * Time complexity O(N) space O(N)
	 */
	
	static int countNodesinGivenRange(Node root,int high,int low) {
		if(root==null) return 0;
		//optimisation case
		if(root.val==high && root.val==low) return 1;
		
		if(root.val<=high && root.val>=low) {
			return 1+countNodesinGivenRange(root.left, high, low)+countNodesinGivenRange(root.right,high,low);
		}
		else if(root.val<low) {
			return countNodesinGivenRange(root.right, high, low);
		}
		else {
			return countNodesinGivenRange(root.left,high,low);
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.root=new Node(50);
		insertinBST(tree.root,30);
        insertinBST(tree.root,70);
        insertinBST(tree.root,20);
        insertinBST(tree.root,40);
        insertinBST(tree.root,60);
        insertinBST(tree.root,80);
        System.out.println(LevelOrderTraversal(tree.root));
        
        System.out.println(countNodesinGivenRange(tree.root, 60, 30));

	}

}
