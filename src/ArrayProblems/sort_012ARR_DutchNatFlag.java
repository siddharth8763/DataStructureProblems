package ArrayProblems;

public class sort_012ARR_DutchNatFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,0,2,2,1};
		printArray(arr);
		sort_012ARR_Dutch(arr);

	}
	/*one traversal solution
	 * if 0 swap low and mid, low++,mid++
	 * if 1 mid++
	 * if 2 swap mid and high, high--
	 * Better approach since one traversal
	 * O(N)-time complexity
	 * O(1)- Auxilary space since one traversal of array
	 */
	static void sort_012ARR_Dutch(int arr[]){
		int low=0,mid=0,high=arr.length-1,temp;
		while(mid<=high) {
			switch(arr[mid]) {
			case 0:
				temp=arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				mid++;low++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp=arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
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
