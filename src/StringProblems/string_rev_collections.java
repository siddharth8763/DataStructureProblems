package StringProblems;

import java.util.*;
import java.util.Scanner;

public class string_rev_collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		List<Character> t1=new ArrayList<>();
		
		for(char c:ch) {
			t1.add(c);
		}
		Collections.reverse(t1);
		ListIterator i=t1.listIterator();
		while(i.hasNext()) {
			System.out.print(i.next());
		}
	}

}
