package StringProblems;

import java.util.Scanner;

public class stringinterlivingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string A");
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine();
		
		System.out.println("Enter the string B");
		String B=sc.nextLine();
		
		System.out.println("Enter the string C");
		String C=sc.nextLine();
		
		System.out.println(stringinterlivingString(A,B,C));

	}
	
	/*
	 * Time Complexity O(n) since constant work??
	 * 
	 * This will work only for distinct characters. Dynamic Programming will work on repeating chars
	 */
	
	static boolean stringinterlivingString(String A,String B,String C) {
		if(A.length()+B.length()!=C.length()) {
			return false;
		}
		
		int i=0,j=0,k=0;

		while(k!=C.length()) {
			
			// check if first character of C matches with first character of A
			if(i<A.length() && A.charAt(i)==C.charAt(k)) {
				i++;
			}
			
			// check if first character of C matches with first character of B
			else if(j<B.length() && B.charAt(j)==C.charAt(k)) {
				j++;
			}
			
			else {
				return false;
			}
			k++;
		}
		
		// after accessing all characters of result
	    // if either first or second has some characters left
		
		
		if(i<A.length() || j<B.length()) {
			return false;
		}
		return true;
	}

}
