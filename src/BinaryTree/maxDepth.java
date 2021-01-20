package BinaryTree;

public class maxDepth {
	
	/*
	 * Time Complexity O(N) since we are traversing all the elements in the tree
	 */
	
	static int maxDepth(Node root) {
		if(root==null) {
			return 0;
		}
		
		int left=maxDepth(root.left);
		int right=maxDepth(root.right);
		
		return 1+(Math.max(left, right));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree(); 
		   
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(5);
   
        System.out.println("Height of tree is : " +  
                                      maxDepth(tree.root));

	}

}
