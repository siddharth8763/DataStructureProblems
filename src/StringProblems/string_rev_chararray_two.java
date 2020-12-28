package StringProblems;

import java.util.Scanner;

public class string_rev_chararray_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		int left=0;
		int right=ch.length-1;
		char temp;
		while(left<right) {
			temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
		for(char c:ch) {
			System.out.print(c);
		
		}

	}

}
