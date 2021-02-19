package DivideAndConquer;
import java.util.*;
public class HouseThief {

	public static void main(String[] args) {
		//Do not stole from alternate house
		int arr[] = {6,7,1,30,8,2,4};
		int sum = 0; 
		int dp [] = new int[arr.length + 1];
		System.out.println(theifTopBottom(arr,0,arr.length-1,dp)); //TopBottom
		
		int dp1 [] = new int[arr.length + 1];
		System.out.println(theifBottomUp(arr,0,arr.length-1,dp1)); //Bottom-Up
		
		int dp2 [] = new int[arr.length + 2];
		System.out.println(theifBottomUp2(arr,dp2));               //Bottom-Up2

	}

	private static int theifTopBottom(int[] arr,int i , int j, int dp[]) {
		// TODO Auto-generated method stub
		if(i==j)
			return arr[i];
		if(i<=j-1) {
			
			if(dp[i]== 0) {
			
				dp[i] =  Math.max(arr[i] + theifTopBottom( arr, i+2, j, dp),arr[i+1] + theifTopBottom( arr, i+3, j, dp));
				return dp[i];
			}else
				return dp[i];
			
		}
		return 0;
	}
	private static int theifBottomUp (int[] arr,int i , int j, int dp[]) {
		int c = 0, c1 = 0, ans =0;
		while(i<j) {
				c = arr[i] ;
				c1 =arr[i+1] ;
				if(c>c1) {
					ans = ans + c;
					i += 2;
				}else {
					ans = ans +  c1;
					i += 3;
				}
		}
		return ans;
	
	}
	private static int theifBottomUp2(int[] arr, int dp[]) {
		
		for(int i = arr.length-1 ; i>= 0 ; i-- ) {
			
			dp[i] = Math.max(arr[i] + dp[i+2], dp[i+1]);
			
		}
		return dp[0];
	
	}

}
