package StringProblems;
import java.util.*;
import java.util.Scanner;

public class string_rev_stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		StringBuffer s1=new StringBuffer(s);
		
		System.out.println(s1.reverse());

	}

}
