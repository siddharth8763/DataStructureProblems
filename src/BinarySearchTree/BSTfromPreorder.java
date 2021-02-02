package BinarySearchTree;

import BinaryTree.Node;

public class BSTfromPreorder extends SearchNInsertBST {
	
	
	/*
	 * Time complexity O(N) and Space O(N)
	 */
	
	public static Node BSTfromPreorder(int[] preorder) {
		return utility(preorder,0,preorder.length);
	}
	
	public static Node utility(int preorder[],int rootindex,int right) {
		if(rootindex>=right) {return null;}
	
	int value= preorder[rootindex];
	Node root=new Node(value);
	
	int i=rootindex+1;
	
	while(i<preorder.length && preorder[i]<value) {
		i++;
	}
	
	root.left=utility(preorder, rootindex+1, i);
	root.right=utility(preorder, i, right);
	
	return root;	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int preorder[]= {8,5,1,7,10,12};
		
		System.out.println(LevelOrderTraversal(BSTfromPreorder(preorder)));
		
		//System.out.println(BSTfromPreorder(preorder));
		

	}

}
