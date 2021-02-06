package BinarySearchTree;

import BinaryTree.BinaryTree;
import BinaryTree.Node;

public class KthlargestelementinBST extends SearchNInsertBST {
	
	/*
	 * Space complexity O(N) and Time O(N)
	 */
	
	
	private static int KthlargestelementinBST(Node root,int k) {
		int nums[] = new int[2];
		utilityinorder(root,nums,k);
		return nums[1];
	}
	
	private static void utilityinorder(Node root,int nums[],int k) {
		if (root==null) {
			return;
		}
		utilityinorder(root.right,nums,k);
		
		//we assume 1 based indexing thats why used ++nums[0]
		// we want to check count of 1st value in nums array
		// we are processing this after left child since left child contains all the smaller values than node
		if(++nums[0]==k) {
			nums[1]=root.val;
			return;
		}
		utilityinorder(root.left,nums,k);
		
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
        
        System.out.println(KthlargestelementinBST(tree.root,2));


	}

}
