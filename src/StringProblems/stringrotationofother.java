package StringProblems;

import java.util.*;

public class stringrotationofother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string A");
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine();
		
		System.out.println("Enter the string B");
		String B=sc.nextLine();
		
		System.out.println(stringrotationofother(A,B));
		

	}
	
	/*
	 * Time complexity O(n) since constant operations
	 */
	static boolean stringrotationofother(String A,String B) {
		return(A.length()==B.length() && (A+A).contains(B));
	}

}
