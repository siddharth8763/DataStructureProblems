package ArrayProblems;

import java.util.*;
public class unionintersection_union_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {1,3,6,6,7,8,8,9};
		int arr2[]= {1,1,3,3,3,6,7,8,10,10};
		System.out.println("Union is");
		unionintersection_union_array1(arr1,arr2);
		System.out.println();
		System.out.println("Intersection is");
		//unionintersection_intersection_array(arr1,arr2);
		unionintersection_intersection_array1(arr1,arr2);

	}
	
	
	/*
	 * Time complexity O(m+n) where m and n are size of arrays
	 * Space Complexity O(1)
	 */
	static void unionintersection_union_array1(int arr1[],int arr2[]) {
		int m=arr1.length;int n=arr2.length;
		int i=0,j=0;
		List<Integer> L=new ArrayList<Integer>();
		while(i<m && j<n) {
		while((i<m-1)&&(arr1[i]==arr1[i+1])) {   //to handle duplicate element
			i++;
		}
		while((j<n-1) && (arr2[j]==arr2[j+1])) {  //to handle duplicate elements
			j++;
		}
		
		if(arr1[i]<arr2[j]) {L.add(arr1[i++]);}   //put that value into the list and increment i
		
		else if(arr1[i]>arr2[j]) {L.add(arr2[j++]);} ////put that value into the list and increment j
		
		else {L.add(arr1[i]);i++;j++;}
		
	}
		while(i<m) {                             // condition to add not same sizze arrays
			if(i<m-1 && arr1[i]==arr1[i+1]) {
				i++;
			}
			else {
				L.add(arr1[i++]);
			}
		}
		
		while(j<n) {							//	condition to add not same sizze arrays
			if(j<n-1 && arr2[j]==arr2[j+1]) {
				j++;
			}
			else {
				L.add(arr2[j++]);
			}
		}

		System.out.print(L);
	}
	
	
	/*
	 * Time complexity O(m+n) where m and n are size of arrays
	 * Space Complexity O(1)
	 * 
	 */
	static void unionintersection_intersection_array1(int arr1[],int arr2[]) {
		int m=arr1.length;int n=arr2.length;
		int i=0,j=0;
		List<Integer> L=new ArrayList<Integer>();
		while(i<m && j<n) {
		while((i<m-1)&&(arr1[i]==arr1[i+1])) {   //to handle duplicate element
			i++;
		}
		while((j<n-1) && (arr2[j]==arr2[j+1])) {  //to handle duplicate elements
			j++;
		}
		
		if(arr1[i]<arr2[j]) {i++;}   //put that value into the list and increment i
		
		else if(arr1[i]>arr2[j]) {j++;} ////put that value into the list and increment j
		
		else {L.add(arr1[i]);i++;j++;}
		}
		System.out.print(L);
	}
	
	
	
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
