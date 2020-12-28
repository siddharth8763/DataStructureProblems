package ArrayProblems;

import java.util.*;
public class move_negative_toAside_collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2, 1, -7, -15, 0, 16, 7};
		System.out.println("original");
        printArray(arr);
        System.out.println("modified");
        move_negative_toAside_collections1(arr);

	}
	
	/*
	 * time complexity O(n+n)
	 * since one n for traversing and one n for filling up the arraylist
	 * 
	 *  Space complexity O(n) since using 2 separate arraylist to store negative and psotive elements
	 *  
	 *  
	 *  sorting based approach time complexity O(nlogn) and space complexity o(1) since no extra space
	 */
	
	static void move_negative_toAside_collections1(int arr[]) {
		List<Integer> positivess= new ArrayList<Integer>();
		List<Integer> negativess=new ArrayList<Integer>();
		for(int i:arr) {
			if(i>=0) {
				positivess.add(i);
			}
			else {
				negativess.add(i);
			}
		}
		
		//based on which side to move we can change below statement
		//addAll() method first ensures that there is sufficient space in the arraylist. 
		//If list does not have space, then it grows the list by adding more spaces in underlying array. 
		//Then it append the elements to end of the list.
		//
		
		
		System.out.println(positivess);
	positivess.addAll(negativess);
	System.out.println(positivess);
		
	}
	
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
