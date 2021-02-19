package dynamicProgramming_DP;

import java.util.Arrays;

public class MatrixChainMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = new int[] {40 ,20, 30, 10, 30}; 
	        int n = arr.length; 
	       
			for(int array[] : t) {
				Arrays.fill(array, -1);
			}
			
	        System.out.println( 
	            "Minimum number of multiplications is "
	            + MatrixChainOrder(arr, 1, n - 1)); 
	}
	static int t[][] = new int[101][101];
	private static int MatrixChainOrder(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		
		if(i>=j) {
			return 0;
		}
		if(t[i][j]!=-1) {
			return t[i][j];
		}
		int min = Integer.MAX_VALUE;
		for(int k = i;k<j;k++)
		{
			int temp = MatrixChainOrder(arr,i,k) + MatrixChainOrder(arr,k+1,j) + 
					(arr[i-1] * arr[k] * arr[j]);
			
			if(min>temp)
				min = temp;
		}
		t[i][j] = min;
		return t[i][j];
	}

}
