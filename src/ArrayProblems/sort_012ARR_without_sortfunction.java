package ArrayProblems;

public class sort_012ARR_without_sortfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,0,2,2,1};
		printArray(arr);
		sort012arr(arr);
		
	}
	/*
	 *  It requires two traversals of array. 
		This solution may not work if values are a part of the structure. 
		For example, consider a situation where 0 represents Computer Science Stream, 1 represents Electronics and 2 represents Mechanical. 
		We have a list of student objects (or structures) and we want to sort them. 
		We cannot use the above sort as we simply put 0s, 1s, and 2s one by one
		
		Time Complexity O(N) since constant work in every loop
		Space Complecxity O(1)- since no extra space is needed
	 */
	
	static void sort012arr(int arr[]) {
		
		int c1 = 0,c2=0,c3=0;
		for(int i=0;i<arr.length;i++) {
			switch(arr[i]) {
			case 0:c1++;break;
			case 1:c2++;break;
			case 2:c3++;break;
			}
		}
		for(int k=0;k<c1;k++) {arr[k]=0;}
		for(int k=c1;k<(c1+c2);k++) {arr[k]=1;}
		for(int k=(c1+c2);k<arr.length;k++) {arr[k]=2;}
		printArray(arr);
	}
	 static void printArray(int arr[]) {
			for (int i=0;i<arr.length;i++)
				System.out.print(arr[i] + " ");
			System.out.println();
		}

}
