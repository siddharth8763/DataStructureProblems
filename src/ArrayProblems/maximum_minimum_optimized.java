package ArrayProblems;

public class maximum_minimum_optimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 1, 7, 15, 0};
		System.out.println("original");
        printArray(arr);
        System.out.println("op array");
        getminmax(arr);

	}
	/* Overall time complexity O(n)
	 * number of comparison
	 * Even- 1+ 3*(n-2)/2
	 * 1 added since setting first 2 elements set explicitly
	 * 3 multiplied since 3 comparison in while loop for every if
	 *	n-2 since loop will run from 2
	 * /2 since i got increamented by 2
	 *
	 *
	 *Odd- 3*(n-1)/2
	 *	no comparison on 1st phase
	 * n-1 since loop will run from 1 to n
	 * 3 multiplied since 3 comparison in while loop for every if
	 * /2 since i got increamented by 2
	 */
	
	static void getminmax(int arr[]) {
		int n=arr.length;
		int max,min,i;
		if (n%2==0) {
			if(arr[0]>arr[1]) {
				max=arr[0];
				min=arr[1];
			}
			else {
				max=arr[1];
				min=arr[0];
			}
			i=2;
		}
		else {
			min=arr[0];
			max=arr[0];
			i=1;
		}
		while(i<n-1) {
			if(arr[i]>arr[i+1]) {
				if(arr[i]>max) {
					max=arr[i];
				}
				else if(arr[i+1]<min) {
					min=arr[i+1];
				}
			}
			else {
				if(arr[i]<min) {
					min=arr[i];
				}
				else if(arr[i+1]>max) {
					max=arr[i+1];
				}
			}
			i+=2;
		}
		System.out.print("Minimum in array is "+min);
		System.out.println();
		System.out.println("Maximum in array is "+max);
	}
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
