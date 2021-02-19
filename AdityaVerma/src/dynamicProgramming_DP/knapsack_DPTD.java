package dynamicProgramming_DP;

import java.util.Arrays;

public class knapsack_DPTD {

	static int t [][] = new int [101][1001];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wt[] = {1,3,4,5};
		int val[] = {1,4,3,20};
		int W =  7;
		int value = 0;
		
		for(int arr[] : t) {
			Arrays.fill(arr, -1 );
		}
		
		int i =0,ks=0;
		for(i = 0; i< wt.length+1 ; i++) {
			for(ks = 0 ; ks<W+1; ks++) {
				if(i == 0 || ks == 0) {
					t[i][ks] =0;
					continue;
				}
				
				if(wt[i-1] <= ks) {
				
					t[i][ks] =Math.max(val[i-1]+ t[i-1][ks - wt[i-1]],t[i-1][ks]);
					//System.out.print(t[i ][j]+" ");
					
				}else	t[i][ks] = t[i-1][ks];
				
				if(i==wt.length && ks==W)
					System.out.println(t[i][ks]);
			}
		}
	
	}
}
