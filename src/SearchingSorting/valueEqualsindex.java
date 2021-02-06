package SearchingSorting;

import java.util.*;

public class valueEqualsindex {
	static List<Integer> valueEqualsIndex(int arr[]) {
		List<Integer> l=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==i+1) {
				l.add(arr[i]);
			}
			
		}
		
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,56,4};
		
		System.out.println(valueEqualsIndex(arr));
		

	}

}
