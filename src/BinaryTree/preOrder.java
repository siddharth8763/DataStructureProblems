package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preOrder {
		
	/* both for iterative and reccursive
	 * Time Complexity O(N)
	 * Space-O(N)
	 */
	
	static List<Integer> preOrderIterative(Node root){
		List<Integer> result=new ArrayList<>();
        if(root==null){return result;}
        Stack<Node> stack=new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            Node curr=stack.pop();
            if(curr!=null){
                result.add(curr.val);
                stack.push(curr.right);
                stack.push(curr.left);
            }
            
        }
        return result;
        
    }
	
	
	
	static void preOrderReccursive(Node root) {
		if(root==null) {return;}
		System.out.print(root.val+" ");
		preOrderReccursive(root.left);
		preOrderReccursive(root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				
		        System.out.println(preOrderIterative(tree.root));
		        preOrderReccursive(tree.root);


	}

}
