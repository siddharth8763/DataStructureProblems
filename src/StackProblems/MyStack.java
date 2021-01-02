package StackProblems;


/*
 * this implementation handles under and overflow
 * this does dynamically resize the array
 */

import java.util.*;
public class MyStack {

	 ArrayList<Integer> al=new ArrayList<>();
	    
	 
	 public void push(int x){
	        al.add(x);
	    }
	    
	    // modifies AL
	    public int pop(){
	        
	    	int res=al.get(al.size()-1);
	        al.remove(al.size()-1);
	        return res;
	    }
	    
	    // does not modify AL
	    public int peek(){
	        return al.get(al.size()-1);
	    }
	    
	    
	    public int size(){
	        return al.size();
	    }
	    
	    public boolean isEmpty(){
	        return al.isEmpty();
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack s=new MyStack();
	    s.push(5);
	    s.push(10);
	    s.push(20);
	    System.out.println(s.pop());
	    System.out.println(s.size());
	    
	    System.out.println(s.peek());
	    System.out.println(s.isEmpty());

	}
}
