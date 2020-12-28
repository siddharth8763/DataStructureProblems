package StringProblems;
import java.util.*;
public class string_rev_stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		StringBuilder s1=new StringBuilder();
		s1.append(s);
		System.out.println(s1.reverse());

	}

}
