package SearchingSorting;

import java.util.*;
public class findfirstlastoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,4,6,7,8};
        System.out.println("Original");
		printArray(arr);
		System.out.println("first occurance of ");
		System.out.println(first(arr,4));
		
		System.out.println("last occurance of ");
		System.out.println(last(arr,4));
		
	}
	
	/*
	 * time complexity O(log n) since using binary search principle
	 * space complexity O(1) since no extra array 
	 */
	
	static int first(int arr[],int ele) {
		int res=-1;
		int start=0,end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2; //just to counter overflow issue
			if(arr[mid]>=ele) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
			if(arr[mid]==ele) res=mid;
		}
		return res;
	}
	
	static int last(int arr[],int ele) {
		int res=-1;
		int start=0,end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2; //just to counter overflow issue
			if(arr[mid]<=ele) {				
				start=mid+1;
			}
			else {
				end=mid-1;
			}
			if(arr[mid]==ele) res=mid;
		}
		return res;
		}
	
	
	
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
