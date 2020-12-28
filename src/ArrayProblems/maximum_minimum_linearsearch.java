package ArrayProblems;
import java.util.*;
public class maximum_minimum_linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 1, 7, 15, 0};
		System.out.println("original");
        printArray(arr);
        System.out.println("op array");
        getminmax(arr);
	}
	
	/*Time complexity is O(n) 
	 *   1+2*(n-2) comparison
	 * +1 since we are setting 1st 2 values
	 * (n-2)since we are running the loop from 2
	 * 2 multiplied since we are doing 2 operation in each loop
	 * 
	*/
	static void getminmax(int arr[]) { 
		int max,min,n;
		n=arr.length;
		if(n==1) {
			max=arr[0];
			min=arr[0];
		}
		else {
			if(arr[0]>arr[1]) {
				max=arr[0];
				min=arr[1];
			}
			else {
				max=arr[1];
				min=arr[0];
			}
		}
		for(int i=2;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.print("Minimum in array is "+min);
		System.out.println();
		System.out.println("Maximum in array is "+max);
	}
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
