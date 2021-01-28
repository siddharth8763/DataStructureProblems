package BinarySearchTree;

import BinaryTree.BinaryTree;
import BinaryTree.Node;

public class inorderPredesSuccs extends SearchNInsertBST {
	
	
	/*
	 * Time complexity O(h) and space O(1)
	 * h is height
	 */
	
	public static Node getPredecessor(Node root) {
		if(root==null) {return null;}
		
		Node temp=root.left;
		
		while(temp.right!=null) {
			temp=temp.right;
		}
		return temp;
	}
	
	public static int getInorderPredes(Node root,int key) {
		if(root==null) {return Integer.MIN_VALUE;}
		
		Node inorderprdes=null;
		
		while(root!=null) {
			if(key<root.val) {
				root=root.left;
			}
			else if(key>root.val) {
				inorderprdes=root;
				root=root.right;
			}
			else {
				if(root.left!=null) {
					inorderprdes=getPredecessor(root);
				}
				break;
			}
		}
		return root!=null ? inorderprdes.val : null;
	}
	
	
	public static Node getSuccessor(Node root) {
		if(root==null) {return null;}
		
		Node temp=root.right;
		
		while(temp.left!=null) {
			temp=temp.left;
		}
		return temp;
	}
	
	public static int getInorderSucc(Node root,int key) {
		if(root==null) {return Integer.MAX_VALUE;}
		
		Node inordersucc=null;
		
		while(root!=null) {
			if(key<root.val) {
				inordersucc=root;
				root=root.left;
			}
			else if(key>root.val) {
				
				root=root.right;
			}
			else {
				if(root.right!=null) {
					inordersucc=getSuccessor(root);
				}
				break;
			}
		}
		return root!=null ? inordersucc.val : null;
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
        
        
        System.out.println(getInorderPredes(tree.root,70));
        System.out.println(getInorderSucc(tree.root,70));
        
      
        
        
        //LevelOrderTraversal(tree.root);


	}

}
