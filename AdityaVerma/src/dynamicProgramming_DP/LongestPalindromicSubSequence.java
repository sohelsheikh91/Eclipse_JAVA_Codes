package dynamicProgramming_DP;

//public class LongestPalindromicSubSequence {

//}

import java.util.*;
import java.lang.*;
import java.io.*;

class LongestPalindromicSubSequence {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input

		    String s1=sc.next();            // Take both the string as input

		    LCS2 obj = new LCS2();
		    
		    System.out.println(obj.lcs(p, p, s1, String.valueOf(new StringBuffer(s1).reverse())));
		}
	}
}// } Driver Code Ends


class LCS2{
    
    // function to find LCS
    
    static int t[][] = new int[101][101]; 
    static int lcs(int x, int y, String s1){
        // your code here
    	
    	
    	String s2 = String.valueOf(new StringBuffer(s1).reverse());
      /* Not necessary Gives TLE
    	for(int arr[]:t){
            Arrays.fill(arr,-1);
        }
    	*/
        int i =0,j =0;
        // Donot forget to make x and y to i and j while doing memoized to dp
        for( i =0;i<=x; i++ ){
          for(j=0; j<=y ; j++){
            if(i==0 || j==0){
                t[i][j]=0; continue;
            }
            if(s1.charAt(i-1)==s2.charAt(j-1)){
            
                t[i][j] = 1+ t[i-1][j-1];
              //  System.out.print(s1.charAt(i-1) + " ");
            
            }else{
            
                t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
             
            }
          }
        }
        /*Printing Longest Common Subsequence**/

        return t[i-1][j-1];
    }
}