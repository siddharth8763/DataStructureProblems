package ArrayProblems;
import java.util.*;
public class kth_small_collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 6, 3, 17, 1};
        printArray(arr);
        System.out.println(kthsmall_coll(arr, 5));
       // kthsmall_coll(arr, 4);
        //System.out.print("Reversed array is \n");
        //printArray(arr);
	}
	/*
	 * time complexity is O(nlog n)
	 * since using in built sort function
	 */
	static int kthsmall_coll(int arr[],int k) {
		Arrays.sort(arr);
		//return arr[arr.length-k]; largest
		return arr[k-1];
	}
	
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
