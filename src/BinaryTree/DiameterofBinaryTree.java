package BinaryTree;

public class DiameterofBinaryTree {
	
	static int ans=0;
	
	/*
	 * time complexity O(N) since we are traverssing each element of the tree once
	 * Space- O(N) since recurrsion and recurssion stack call
	 * 
	 */
	
	static int DiameterofBinaryTree(Node root) {
		maxxDepth(root);
		return ans==0?0:ans-1;
	}
	
	
	
	static int maxxDepth(Node root) {
		if(root==null) return 0;
		int left=maxxDepth(root.left);
		int right=maxxDepth(root.right);
		ans=Math.max(ans, (left+right+1));
		return 1+(Math.max(left, right));
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
		System.out.println(DiameterofBinaryTree(tree.root));

	}

}
