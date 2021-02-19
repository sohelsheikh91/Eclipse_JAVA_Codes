package GreedyTwo;
import java.util.Arrays;

public class CoinChangeProblem {
	static void coinChangeProblem(int [] coins, int N) {
	    
		Arrays.sort(coins);//Sort the coins in ascending order
		int index = coins.length-1;
		int ans=0;
		while(true){
		    if(N==0)
		    	break;
		    
		   	int coinValue = coins[index];
			index--;
			int maxAmount = (N/coinValue)*coinValue;
			
			if(maxAmount>0) {
				ans =ans + (N/coinValue);
	    	  System.out.println("Coin value: "+coinValue+ " taken count: "+(N/coinValue));
	    	   N = N - maxAmount;
			}
	    
		}//end of while loop
		System.out.println(ans);
	}//end of method

}//end of class
