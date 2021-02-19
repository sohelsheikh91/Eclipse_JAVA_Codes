package DivideAndConquer;

public class SelfNumberFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,3,4};
		int n = 7;
		int sum =0;
		int dp[] = new int[n+1];
		int dp1[] = new int[n+1];
		System.out.println("factorTopDown "+ factorTopDown(dp , n,0));
		System.out.println("factorBottomUp "+ factorBottomUp(dp1, n));
	}
	public static int factorTopDown (int [] dp ,int n ,int sum) {
		if(n<0)
			return 0;
		if(n == 0 || n==1 || n==2) {
			return 1;
		}
		if(dp[n] == 0) 
		{
			if(n>=3) 
			{
				sum = sum + factorTopDown(dp, n-1, sum);
				sum= sum+ factorTopDown(dp, n-3, sum);
				sum= sum + factorTopDown(dp, n-4, sum);
			}
			dp[n]= sum;
		}
		return dp[n] ;
	}
	
	public static int factorBottomUp(int [] dp , int n) {
		
		if(n>2) {
			 dp [0] = 1;
			 dp [1] = 1;
			 dp [2] = 1;
		}else if (n<= 2 && n>=0)
			return 1;
		else
			return -1;
		
		for(int i = 3; i<= n ; i++) {

			 dp[i] += dp[i-1];
			 if((i-3)>=0)
			 dp[i] += dp[i-3];
			 if((i-4)>=0)
			 dp[i] += dp[i-4];
		}
		return dp[n];
		 
	}
}
