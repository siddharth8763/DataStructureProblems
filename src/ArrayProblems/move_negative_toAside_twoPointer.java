package ArrayProblems;

public class move_negative_toAside_twoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2, 1, -7, -15, 0, 16, 7};
		System.out.println("original");
        printArray(arr);
        System.out.println("modified");
        move_negative_toAside_twoPointer1(arr);
        printArray(arr);

	}
	/*
	 * Time complexity O(N)  
	 * Space complexity O(1) since no extra array used
	 */
	
	static void move_negative_toAside_twoPointer1(int arr[]) {
		int start=0,end=arr.length-1,temp;
		while(start<=end) {
			
			//if both are -ve increase only start
			if(arr[start]<0 && arr[end]<0) {
				start++;
			}
			//if left half +ve and right half -ve swap
			else if(arr[start]>=0 && arr[end]<0) {
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
			else if(arr[start]>=0 && arr[end]>=0) {
				end--;
			}
			else {
				start++;
				end--;
			}
			
		}
		
	}
	
	
	
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
