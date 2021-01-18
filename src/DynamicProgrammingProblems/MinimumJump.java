package DynamicProgrammingProblems;

import java.util.Arrays;

public class MinimumJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {2,3,1,1,2,4,2,0,1,1};
		int arr[]= {0,1,1,1,1};
		System.out.println(MinimumJump(arr));
	}
	
	/*
	 * Time Complexity O(N) 
	 * Space Complexity O(1)
	 * We can Assume that we can always reach the end of the array
	 */
	
	static int MinimumJump(int arr[]) {
		int pos=0,dest=0,jump=0;
		if (arr[0]==0) return -1;
		for(int i=0;i<arr.length-1;i++) {
			dest=Math.max(dest, i+arr[i]); //index + element at index		
			if(pos==i) {//basically it will check if there is a greater value earlier, if it is there, it will update the pos with dest
						//0,2
				pos=dest;
				jump++;
			}
		}
		return jump;	
	}
}
