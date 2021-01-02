package StringProblems;
import java.util.*;

public class longestpalindromeFirstpal {

	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    String s=sc.next();
		    System.out.println(longestpalindromesubstring(s));	    
		    t--;
		}
	}
	/*
	 * Time Complexity O(N^2)
	 * it returns first in case of conflict
	 */
	static String longestpalindromesubstring(String s){
	    int maxlength=1;
	    int high,low;
	    int start=0;
	    int len=s.length();
	    
	    //even
	    for(int i=1;i<len;i++){
	        low = i - 1; 
            high = i; 
            while (low >= 0 && high < len 
                   && s.charAt(low) 
                          == s.charAt(high)) { 
                if (high - low + 1 > maxlength) { 
                    start = low; 
                    maxlength = high - low + 1; 
                } 
                low--; 
                high++;
	    }
	    }
	    
	    //Odd
	    for(int i=1;i<len;i++){
	        low = i - 1; 
            high = i+1; 
            while (low >= 0 && high < len 
                   && s.charAt(low) 
                          == s.charAt(high)) { 
                if (high - low + 1 > maxlength) { 
                    start = low; 
                    maxlength = high - low + 1; 
                } 
                low--; 
                high++;
	    }
	    }
	    
	    return printstr(s, start, start + maxlength - 1);
	}
	
	static String printstr(String s,int start,int end){
	    String s1=s.substring(start,end+1);
	    return s1;
	}
	
	
	

}
