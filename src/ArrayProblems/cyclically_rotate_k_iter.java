package ArrayProblems;

public class cyclically_rotate_k_iter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 1, 7, 15, 0};
		System.out.println("original");
        printArray(arr);
        System.out.println("op array");
        cyclically_rotate_k(arr,2);
        //printArray(arr);

	}
	/*
	 * Time Complexity O(N)
	 * Space Complexity O(1)
	 */
	static void cyclically_rotate_k(int arr[],int k) {
		k=k%arr.length; // after n rotation same values
		int n=arr.length;
		for(int i=0;i<arr.length;i++) {
			if(i<k) {System.out.print(arr[n+i-k]+",");} 
			else {System.out.print(arr[i-k]+",");}
		}
	}
	
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i] + ",");
		System.out.println();
	}

}
