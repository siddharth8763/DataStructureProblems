package StringProblems;

import java.util.*;

public class longestpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(longestpalindrome(s));
	}
	
	/*
	 * time complexity O(n^2)
	 * space complexity O(1)
	 */
	
	static String longestpalindrome (String s) {
		if(s==null || s.length() < 1) return "";
		int start=0,end=0;
		for(int i=0;i<s.length();i++) {
			int len1=expandfrommiddle(s, i, i);//racecar type of palindrome
			int len2=expandfrommiddle(s, i, i+1);//aabbaa type of palindrome
			int len = Math.max(len1, len2);
			
			if(len>end-start) { //if length greater than boundary of substring we are going to return
				start=i-((len-1)/2);
				end=i+(len/2);
				
			}
		}
		return s.substring(start, end+1);
	}
	/* Basically it is customized palindrome checker
	 * this function basically returns length of the string starting from the begining.
	 * it also checks for palindrome condition as well
	 */
	static int expandfrommiddle(String s,int start,int end) {
		if(s==null || start>end) return 0; // length check condition
		
		while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)) {
			start--;end++;
		}
		return end-start-1; // length return
	}
	

}
