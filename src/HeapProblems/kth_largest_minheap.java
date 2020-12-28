package HeapProblems;
import java.util.*;
public class kth_largest_minheap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 6, 3, 17, 1};
        printArray(arr);
        System.out.println(kthlarge_minheap(arr,5));

	}
	/*
	 * Iterate through your numbers placing each number in a min heap. 
	 * If the heap's size exceeds k, remove an element from the heap. 
	 * After you'd iterated through all your numbers, the last k element in the array will be in the heap. 
	 * Therefore, the kth largest thing will be at the root of the heap, so we return it
	 * 
	 * O(n)
	 */
	
	static int kthlarge_minheap(int arr[],int k) {
		PriorityQueue<Integer> minheap=new PriorityQueue<Integer>();
		//adding elements to the min heap
		for(int i:arr) {
			minheap.add(i);
			if(minheap.size()>k) {
				minheap.remove();
			}
		}
		return minheap.remove();
	}
	
	
	
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
