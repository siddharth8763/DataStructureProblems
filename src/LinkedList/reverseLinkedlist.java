package LinkedList;
//import java.util.*;


public class reverseLinkedlist {
	
	/*
	 * Time Complexity O(N) and Space O(1)
	 */
	
	
	static ListNodeSL reverseLLiterative(ListNodeSL head) {
		ListNodeSL curr=head;
		ListNodeSL prev=null;
		while(curr!=null) {
			ListNodeSL temp=curr.next;// created so that whjile breaking link we don't lose track of LL
			//breaking old link and create new link
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}
	
	static ListNodeSL reverseLLrecurssive(ListNodeSL head) {
		return reverseUtilityLL(head,null);
	}
	
	static ListNodeSL reverseUtilityLL(ListNodeSL head, ListNodeSL newHead) {
		if(head==null) {
			return newHead;
		}
		
		ListNodeSL temp=head.next;
		head.next=newHead;
		newHead=head;
		head=temp;
		
		return reverseUtilityLL(head,newHead);
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNodeSL list = new ListNodeSL();
        list.val = 85;
        list.next = new ListNodeSL(15);
        list.next.next = new ListNodeSL(4);
        list.next.next.next = new ListNodeSL(20);
        list.next.next.next.next = new ListNodeSL(69);
        
        System.out.println(reverseLLiterative(list));
        System.out.println(reverseLLrecurssive(list));
        
        
        
	}

}
