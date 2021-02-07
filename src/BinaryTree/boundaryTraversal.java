package BinaryTree;

public class boundaryTraversal {
	
	/*
	 * Time and space complexity O(N)
	 */
	
	static void boundaryTraversal(Node root) {
		if(root==null) return;
		
		System.out.println(root.val+" ");
		printboundaryleft(root.left);
		
		printleavenodes(root.left);
		printleavenodes(root.right);
		
		printboundaryright(root.right);
		
	}

	private static void printboundaryright(Node root) {
		// TODO Auto-generated method stub
		if(root==null) return;
		 
		if(root.right!=null) {
			printboundaryright(root.right);
			System.out.print(root.val+" ");
		}
		else if(root.left!=null) {
			printboundaryright(root.left);
			System.out.print(root.val+" ");
		}
		
	}

	private static void printleavenodes(Node root) {
		// TODO Auto-generated method stub
		if(root==null) return;
		
		printleavenodes(root.left);
		
		if(root.left==null && root.right==null) {
			System.out.println(root.val+" ");
		}
		
		printleavenodes(root.right);
		
	}

	private static void printboundaryleft(Node root) {
		// TODO Auto-generated method stub
		if(root==null) return;
		if(root.left!=null) {
			System.out.print(root.val+" ");
			printboundaryleft(root.left);
		}
		else if(root.right!=null) {
			System.out.print(root.val+" ");
			printboundaryleft(root.right);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);
        
        boundaryTraversal(root);
	}

}
