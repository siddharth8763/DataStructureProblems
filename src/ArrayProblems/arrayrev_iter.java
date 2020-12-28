package ArrayProblems;
import java.util.*;
public class arrayrev_iter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5};
        printArray(arr);
        arrayrev1(arr, 5, 4);
        System.out.print("Reversed array is \n");
        printArray(arr);

	}
	static void arrayrev1 (int arr[],int start,int end) {
		int temp;
		while(start<end) {
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
}
	
	 static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	

}
