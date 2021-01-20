package BinaryTree;

import java.util.*;
public class inOrder {
	
	
	/* both for iterative and reccursive
	 * Time Complexity O(N)
	 * Space-O(N)
	 */
	
	
	static List<Integer> inOrderIterative(Node root){
		List<Integer> list=new ArrayList<>();
		Stack<Node> stack=new Stack();
		
		while(!stack.isEmpty() || root!=null) {
			while(root!=null) {
				stack.push(root);
				root=root.left;
			}
			root=stack.pop();
			list.add(root.val);
			root=root.right;
		}
		return list;
	}
	
	static void inOrderReccursive(Node root) {
		if(root==null) {return;}
		inOrderReccursive(root.left);
		System.out.print(root.val+" ");
		inOrderReccursive(root.right);
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
		
        System.out.println(inOrderIterative(tree.root));
        inOrderReccursive(tree.root);

	}

}
