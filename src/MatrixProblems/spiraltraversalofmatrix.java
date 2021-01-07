package MatrixProblems;
import java.util.*;

public class spiraltraversalofmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println(spiralTraversal(matrix));
	}
	
	/*
	 * Time Complexity O(N) and Space Complexity O(N)
	 * where N is the number of elements in the matrix
	 */
	
	public static List<Integer> spiralTraversal(int matrix[][]){
		ArrayList<Integer> L=new ArrayList<Integer>();
		if(matrix==null || matrix.length==0) {
			return L;
		}
		int left=0;
		int right=matrix[0].length-1;
		int top=0;
		int bottom=matrix.length-1;
		int size=matrix.length*matrix[0].length;
		while(L.size()<size) {
			for(int i=left;i<=right && L.size()<size;i++) {
				L.add(matrix[top][i]);  
			}
			top++;
			
			for(int i=top;i<=bottom && L.size()<size;i++) {
				L.add(matrix[i][right]);
			}
			right--;
			
			for(int i=right;i>=left && L.size()<size;i--) {
				L.add(matrix[bottom][i]);
			}
			bottom--;
			
			for(int i=bottom;i>=top && L.size()<size;i--) {
				L.add(matrix[i][left]);
			}
			left++;
		}
		
		return L;
	}
}
