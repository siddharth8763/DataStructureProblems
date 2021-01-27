package BinarySearchTree;

import BinaryTree.BinaryTree;
import BinaryTree.Node;

public class deleteinBST extends SearchNInsertBST {
	
	//Time complexity O(N) and Space Complexity O(N)
	
	
	/*
	 * This max function finds the max element among nodes
	 */
	
	public static int maxinBST(Node root) {
		if(root.right==null) {
			return root.val;
		}
		return maxinBST(root.right);
	}
	
	public static int mininBST(Node root) {
		if(root.left==null) {
			return root.val;
		}
		return mininBST(root.left);
	}
	
	
	public static Node deleteinBST(Node root,int key) {
		if(root==null) {return root;}
		
		if(key<root.val) {
			root.left=deleteinBST(root.left, key);
		}
		else if(key>root.val) {
			root.right=deleteinBST(root.right,key);
		}
		else {
			
			//both child exists
			
			/*
			 * Search for max element among the left subtree
			 * Replace the node with that value
			 * delete the max element from its original position to avoid duplicate values.
			 */
			
			if(root.left!=null && root.right!=null) {
				int lmax=maxinBST(root.left);
				root.val=lmax;
				root.left=deleteinBST(root.left, lmax);
				return root;
			}
			
			//only right child exists
			else if(root.left!=null){
				return root.left;
			}
			
			//only left child exists
			else if(root.right!=null){
				return root.right;
			}
			else {
				return null;
			}
			
		}
		
		return root;
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
        /*tree.root.left = new Node(30); 
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);
   */
        insertinBST(tree.root,30);
        insertinBST(tree.root,70);
        insertinBST(tree.root,20);
        insertinBST(tree.root,40);
        insertinBST(tree.root,60);
        insertinBST(tree.root,80);
        
        System.out.println("Before");
        System.out.println(LevelOrderTraversal(tree.root));
        
        System.out.println("After");
        deleteinBST(tree.root,20);
        
        System.out.println(LevelOrderTraversal(tree.root));
        
        System.out.println(mininBST(tree.root));
        System.out.println(maxinBST(tree.root));
        
        
        //LevelOrderTraversal(tree.root);


	}

}
