package MatrixProblems;

public class BinarySearchinMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		//int matrix[][]= {{1}};
		System.out.println(BinarySearchMatrix(matrix, 9));

	}
	
	/*
	 * time complexity (log(row*col))
	 * Space Complexity O(1)
	 */
	
	
	static boolean BinarySearchMatrix(int arr[][],int ele) {
		if(arr.length==0) return false;
		
		int row=arr.length;int col=arr[0].length;
		
		int left=0;int right=(row*col)-1;
		
		while(left<=right) {
			int mid=left+(right-left)/2;
			int midele=arr[mid/col][mid%col];
			if(midele==ele) {
				return true;
			}
			else if(midele<ele) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return false;	
	}
}
