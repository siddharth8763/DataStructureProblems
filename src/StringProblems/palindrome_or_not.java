package StringProblems;

import java.util.Scanner;

public class palindrome_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		// char ch[]=s.toCharArray();
		int start = 0;
		int end = s.length() - 1;
		boolean isPa = true;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				isPa = false;
				break;
			}
			start++;end--;
		}
		if(isPa)
			System.out.println("Y");
		else
			System.out.println("N");

	}

}
