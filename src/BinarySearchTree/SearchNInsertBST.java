package BinarySearchTree;

import BinaryTree.BinaryTree;
import BinaryTree.LevelOrderTraversal;
import BinaryTree.Node;


public class SearchNInsertBST extends LevelOrderTraversal  {
	
	/*
	 * Time and Space Complexity O(N) 
	 */
	
	public static boolean searchinBST(Node root,int key) {
		//if(root==null || root.val==key) {return root;}
		if(root==null) {return false;}
		if(root.val==key) {return true;}
		
		if(root.val<key) {
			return searchinBST(root.right,key);
		}
		return searchinBST(root.left,key);
	}
	
	
	public static Node insertinBST(Node root,int val) {
		if(root==null) {return new Node(val);}
		Node current=root;
		
		while(true) {
			if(current.val<val) {
				if(current.right!=null) {
					current=current.right;
				}
				else {
					current.right=new Node(val);
					break;
				}
			}
			else {
				if(current.left!=null) {
					current=current.left;
				}
				else {
					current.left=new Node(val);
					break;
				}
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
        
        System.out.println(LevelOrderTraversal(tree.root));
        System.out.println(searchinBST(tree.root, 200));
        //LevelOrderTraversal(tree.root);
        

	}

}
