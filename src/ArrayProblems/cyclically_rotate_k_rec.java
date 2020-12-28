package ArrayProblems;

public class cyclically_rotate_k_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,8,9,10};
		System.out.println("original");
        printArray(arr);
        System.out.println("op array");
        cyclically_rotate_k_rec_1(arr,2);
        printArray(arr);
	}
	
	static void cyclically_rotate_k_rec_1(int arr[],int k) {
		
		int len=arr.length;
		k=k % len;
		
		rev(arr,0,len-1);
		rev(arr,0,k-1);
		rev(arr,k,len-1);
		//rev(arr,len-k,len-1);
		
		
	}
	
	static void rev(int arr[],int st,int en) {
		int temp;
		st=0;
		en=arr.length-1;
		while(st<en) {
		temp=arr[st];
		arr[st]=arr[en];
		arr[en]=temp;
		st++;
		en--;
		}
	}
	
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i] + ",");
		System.out.println();
	}

}
