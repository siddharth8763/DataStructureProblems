package BinaryTree;

import java.util.*;
public class TopView {
	
	
	/*
	 * Time Complexity O(nlog n) n nodes and log n for Treemap
	 * Space Complexity O(N)
	 */
	
	static void TopView(Node root) {
		if(root==null) return;
		
		TreeMap<Integer,Integer> map=new TreeMap<>();
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node current=queue.remove();
			int hd=current.height;
			
			if(map.get(hd)==null) {
				map.put(hd, current.val);
			}
			
			if(current.left!=null) {
				current.left.height=hd-1;
				queue.add(current.left);
			}
			if(current.right!=null) {
				current.right.height=hd+1;
				queue.add(current.right);
			}
		}
		System.out.println(map.values());
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
		
        TopView(tree.root);


	}

}
