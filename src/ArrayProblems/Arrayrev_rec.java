package ArrayProblems;
import java.util.*;
public class Arrayrev_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 0, 0, 0, 5};
        printArray(arr);
        arrayrev2(arr, 3, 4);
        System.out.print("Reversed array is \n");
        printArray(arr);

	}
	static void arrayrev2(int arr[],int start,int end) {
		int temp;
		if(start>=end)
			return;
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		arrayrev2(arr,start+1,end-1);
	}
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	
}
