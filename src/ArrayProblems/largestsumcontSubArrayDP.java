package ArrayProblems;

import java.util.*;
public class largestsumcontSubArrayDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,2,3,4,4,6,7,8};
        System.out.println("Original");
		printArray(arr);
		
		
	}
	
	static int largestsumcontSubArrayDP(int arr[]) {
		int max_sum=arr[0];
		int curr_sum=max_sum;
		for(int i=1;i<arr.length;i++) {
			curr_sum=Math.max(arr[i]+curr_sum,arr[i]);
			max_sum=Math.max(curr_sum,max_sum);
		}
		return max_sum;
		
	}
	
	
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
