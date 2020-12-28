package ArrayProblems;

public class move_negative_toAside_partitionalgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2, 1, -7, -15, 0, 16, 7};
		System.out.println("original");
        printArray(arr);
        System.out.println("modified");
        move_negative_toAside_partitionalgo1(arr);

	}
	/*less than pivot -ve and greater than pivot +ve
	 * change the condition accroding to move the array to right side 
	 * Time complexity O(N) since running the loop once
	 * Space Complexity O(1) since no extra space
	 * 
	 */
	static void move_negative_toAside_partitionalgo1(int arr[]) {
		int j=-1,pivot=0,temp;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<pivot) {
				j++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		printArray(arr);
	}
	
	
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
