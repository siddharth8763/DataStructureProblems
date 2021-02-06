package BinarySearchTree;

import BinaryTree.BinaryTree;
import BinaryTree.Node;


public class merge2BST extends SearchNInsertBST {
	
	
	/*
	 * Time complexity O(N1+N2) space O(N1+N2)
	 */
	
	static Node merge2BST(Node root1,Node root2) {
		if(root1==null) {
			return root2;
		}
		else if(root2==null) {
			return root1;
		}
		else {
			root1.val+=root2.val;
			
			root1.left=merge2BST(root1.left,root2.left);
			root1.right=merge2BST(root1.right,root2.right);
			
			return root1;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree1 = new BinaryTree();
		tree1.root=new Node(50);
		insertinBST(tree1.root,30);
        insertinBST(tree1.root,70);
        insertinBST(tree1.root,20);
        insertinBST(tree1.root,40);
        insertinBST(tree1.root,60);
        insertinBST(tree1.root,80);
        System.out.println(LevelOrderTraversal(tree1.root));
        
        
        BinaryTree tree2 = new BinaryTree();
        tree2.root=new Node(50);
        insertinBST(tree2.root,130);
        insertinBST(tree2.root,170);
        insertinBST(tree2.root,120);
        insertinBST(tree2.root,140);
        insertinBST(tree2.root,160);
        insertinBST(tree2.root,180);
        System.out.println(LevelOrderTraversal(tree2.root));
        
        
       System.out.println("merged"); 
       System.out.println(LevelOrderTraversal(merge2BST(tree1.root,tree2.root)));
        
        
        
        

	}

}
