package HeapProblems;

import java.util.*;
public class kth_small_maxheap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 6, 3, 17, 1};
        printArray(arr);
        System.out.println(kthsmall_maxheap(arr,5));

	}
	

	static int kthsmall_maxheap(int arr[],int k) {
		PriorityQueue<Integer> maxheap=new PriorityQueue<Integer>(Collections.reverseOrder()); 
			for(int i:arr) {
				maxheap.add(i);
				if(maxheap.size()>k) {
					maxheap.remove();
				}
			}
			return maxheap.remove();
	}
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
