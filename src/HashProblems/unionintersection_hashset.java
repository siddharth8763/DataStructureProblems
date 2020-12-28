package HashProblems;

import java.util.*;
public class unionintersection_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,3,6,6,7,8,8,9};
		int arr2[]= {1,1,3,3,3,6,7,8,10,10};
		System.out.println("Union is");
		unionintersection_union(arr1,arr2);
		System.out.println("Intersection is");
		unionintersection_intersection(arr1,arr2);

	}
	/*
	 * Time Complexity O(m+n) assuming insertion operation takes O(1) time in hashset
	 */
	
	
	static void unionintersection_union(int arr1[],int arr2[]) {
		
		HashSet<Integer> h1=new HashSet<Integer>();
		for(int i:arr1) {
			h1.add(i);
		}
		for(int i:arr2) {
			h1.add(i);
		}
		System.out.println(h1);
	}
	
static void unionintersection_intersection(int arr1[],int arr2[]) {
		
		HashSet<Integer> h1=new HashSet<Integer>();
		HashSet<Integer> h2=new HashSet<Integer>();
		for(int i:arr1) {
			h1.add(i);
		}
		for(int j:arr2) {
			if(h1.contains(j)) {
				h2.add(j);
			}
		}
		System.out.println(h2);
	}
	
	
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
