package StringProblems;

import java.util.*;
public class duplicate_characters_iterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		printdups(str);

	}
	// since 256 ascii values
	static final int NO_OF_CHARS=256;
	
	/*
	 * at compiler level character passed as index is converted to int.
	count[a] is actually count[97]. The count[97] must be 0. So count[t]++ for "test string" makes count[97] value to be 1
	* i.e Fills count array with frequency of characters
	* 
	* Time Complexity O(n)
	 */
	static void fillCharCounts(String str,int count[]) {
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
	}
	
	// print duplicates in the passed string
	static void printdups(String str) {
		int count[]=new int[NO_OF_CHARS];
		fillCharCounts(str,count);
		for(int i=0;i<NO_OF_CHARS;i++) {
			if(count[i]>1) {
				System.out.println((char)i+" count "+count[i]);
			}
		}
	}

}
