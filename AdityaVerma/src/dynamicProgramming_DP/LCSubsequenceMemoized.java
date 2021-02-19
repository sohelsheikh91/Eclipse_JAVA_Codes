package dynamicProgramming_DP;

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class LCSubsequenceMemoized {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    LCS obj = new LCS();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}// } Driver Code Ends


class LCS{
 
 // function to find LCS
 //Recurssive Memoized version
 static int t[][] = new int[101][101]; 

static int lcs(int x, int y, String s1, String s2){
     // your code here
     if(s1.length()==x && s2.length()==y){
         for(int arr[]:t){
             Arrays.fill(arr,-1);
         }
             
     }
/** Do not forget to make x and y to [ i and j] while doing memoized to dp*/
          
     if(x==0|| y==0){
         t[x][y]=0; 
         return t[x][y];
     }
     if(t[x][y]>-1)
         return t[x][y];
     
     if(s1.charAt(x-1)==s2.charAt(y-1)){
         
         t[x][y] = 1+ lcs(x-1,y-1,s1,s2);
         return t[x][y];
         
     }else{
         
         t[x][y] = Math.max(lcs(x,y-1,s1,s2),lcs(x-1,y,s1,s2));
           return t[x][y];
     }
 }
 
}