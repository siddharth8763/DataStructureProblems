package BinaryTree;

public class mirrorofBinaryTree {
	
	/*
	 * time complexity O(N) since we are traverssing each element of the tree once
	 * Space- O(N) since recurrsion and recurssion stack call
	 * 
	 */
	
	
	static Node mirrorofBinary(Node root) {
		if(root==null) {
			return root;
		}
		
		Node left=mirrorofBinary(root.left);
		Node right=mirrorofBinary(root.right);
		
		root.left=right;root.right=left;
		return root;
	}
	
	static void inorder(Node root)  
	{  
	    if (root == null)  
	        return;  
	    inorder(root.left);  
	    System.out.print(root.val);  
	    inorder(root.right);  
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
		//System.out.println(mirrorofBinary(tree.root));
        mirrorofBinary(tree.root);
        inorder(tree.root);

	}

}
