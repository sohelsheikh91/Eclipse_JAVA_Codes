package dynamicProgramming_DP;

import java.util.Arrays;

public class Knapsack_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int wt[] = {1,3,4,5};
		int val[] = {1,4,3,20};
		int W =  7;int value=0;
		
		for(int arr[] : t) {
			Arrays.fill(arr, -1 );
		}
		System.out.print(knapsack(wt,val,W, wt.length));
		
	}
//My way--------------------------------------
	static int t [][] = new int [101][1001];
	
	private static int knapsack(int[] wt, int[] val, int knasackCapacity, int i) {
		// TODO Auto-generated method stub
		if(knasackCapacity==0 || i==0) {
			return 0;
		}
		if(t[knasackCapacity][i]!=-1) {
			return t[knasackCapacity][i];
		}if(knasackCapacity>=wt[i-1]) {
			int current = val[i-1];
			t[knasackCapacity][i] = Math.max(current + knapsack(wt,val,knasackCapacity-wt[i-1],i-1),knapsack(wt,val,knasackCapacity, i-1 ));
			return t[knasackCapacity][i];
		}else if(knasackCapacity< wt[i-1]) {
			t[knasackCapacity][i] = knapsack(wt,val,knasackCapacity, i-1);
			return t[knasackCapacity][i];
		}
		return 0;
	}
}
