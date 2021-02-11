package StringProblems;

import java.util.HashMap;

public class longestRepeatingSubsequencewithoutduplicate {
	
	/*
	 * Time complexity O(N) space O(N)
	 */
	
	static int longestRepeatingSubsequencewithoutduplicate(String str) {
		HashMap<Character,Integer> m=new HashMap<Character,Integer>();
        int left=0;int right=0;
        int n=str.length();
        int len=0;
        while(right<n){
            if(m.containsKey(str.charAt(right))){
                left=Math.max(m.get(str.charAt(right))+1,left);
            }
            m.put(str.charAt(right),right);
            len=Math.max(len,right-left+1);
            right++;
        }
        return len;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcabcbb";
		//op=3 abc
		System.out.println(longestRepeatingSubsequencewithoutduplicate(str));

	}

}
