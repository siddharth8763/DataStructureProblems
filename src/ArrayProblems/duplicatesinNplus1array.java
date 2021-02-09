package ArrayProblems;

public class duplicatesinNplus1array {
	
	/*
	 * Time complexity O(N) and Space O(1) 
	 */
	
	static int duplicatesinNplus1array(int arr[]) {
		if(arr.length==0 || arr==null) {
			return -1;
		}
		int i=0;
		while(i<arr.length) {
			if(arr[i]!=arr[arr[i]-1]) {
				int y=arr[i]-1;
				
				int x=arr[i];
				arr[i]=arr[y];
				arr[y]=x;
			}
			else {
				i++;
			}
		}
		return arr[arr.length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,2,2};
		System.out.println(duplicatesinNplus1array(arr));
		

	}

}
