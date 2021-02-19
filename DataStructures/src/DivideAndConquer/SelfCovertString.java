package DivideAndConquer;

public class SelfCovertString {

	public static void main(String[] args) {
		int dp[][] = new int[5+1][5+1];
		System.out.println(convertTopBottom( "table", "t", 0, 0, dp));
		int dp1[][] = new int[5+1][5+1];
		System.out.println(convertBottomUp( "table", "t", 0, 0, dp1));
	}

	private static int convertTopBottom(String string, String string2, int i, int j, int dp[][]) {
		// TODO Auto-generated method stub
		if(dp[i][j]==0) {
			if(i>string.length()-1) {
				dp[i][j] =  string2.length() - j;
				return dp[i][j];
			}if(j>string2.length() - 1 ) {
				dp[i][j] = string.length()- i;
				return 	dp[i][j];
			}if(string.charAt(i) == string2.charAt(j)) {
				dp[i][j] =  convertTopBottom(string,string2,i+1,j+1, dp);
				return 	dp[i][j];
			}
	
				int c1 = 1 + convertTopBottom(string,string2,i+1,j, dp);//insert
				int c2 = 1 + convertTopBottom(string,string2,i,j+1, dp);//delete
				int c3 = 1 + convertTopBottom(string,string2,i+1,j+1, dp);//replace
				dp[i][j] =  Math.min(Math.min(c1,c2), c3);
				return dp[i][j];
				
			}else
				return dp[i][j];
		
		
	}
	private static int convertBottomUp(String string, String string2, int i, int j, int dp[][]) {
		int c1 = 0 , c2 = 0 , c3 = 0;
		while(i < string.length()-1 && j< string2.length()-1 ) {
			if(i>string.length()-1) {
				dp[i][j] =string2.length() - j;
				return dp[i][j] ;
			}if(j>string2.length() - 1 ) {
				dp[i][j] =string2.length() - j;
				return dp[i][j] ;
			}if(string.charAt(i) == string2.charAt(j)) {
				i++; j++;
			}
			if(dp[i][j]==0) {
				if(string.charAt(++i) == string2.charAt(j)) {
					c1++;
				}else if(string.charAt(i) == string2.charAt(++j)) {
					c2++;
				}else if(string.charAt(i) == string2.charAt(j)) {
					c3++;
				}
				dp[i][j]= Math.min(Math.min(c1,c2), c3);
			}
			
		}
		return Math.min(Math.min(c1,c2), c3);
	}
	
}
