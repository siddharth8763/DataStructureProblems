package SearchingSorting;

public class searchinRotatedsortedarray {
	
	/*
	 * Time Complexity O(log n) since using binary search
	 * Space Complexity O(1) since no extra space
	 */
	
	static int searchinRotatedsortedarray(int arr[],int target) {
		int n=arr.length;
		if(arr==null || arr.length==0) return -1;
		
		int left=0;int right=n-1;
		
		while(left<right) {
			int midpoint=left+(right-left)/2;
			if(arr[midpoint]>arr[right]) {
				left=midpoint+1;
			}
			else {
				right=midpoint;
			}
		}
		if(target<=arr[n-1]) {
			return bin_search(arr,target,left,n-1);
		}
		else {
			return bin_search(arr,target,0,left-1);
		}
		
	}
	
	
	
	private static int bin_search(int arr[],int target,int start,int end) {
		while(start<=end) {
			int midpoint=start+(end-start)/2;
			if(arr[midpoint]==target) {
				return midpoint;
			}
			else if(arr[midpoint]>target) {
				end=midpoint-1;
			}
			else {
				start=midpoint+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,6,7,0,1,2};
		System.out.println(searchinRotatedsortedarray(arr,6));

	}

}
