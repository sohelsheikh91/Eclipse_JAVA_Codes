package dynamicProgramming_DP;

//public class PrintLongestCommonSubSeq {

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class PrintLongestCommonSubSeq {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    LCS1 obj = new LCS1();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}// } Driver Code Ends
/*
 * 
 Inputs --
2 8 7
abcdefgh
gecabhf
6 7
AGGTAB
GXTXAYB 
 **/

class LCS1{
 
 // function to find LCS
 //Recurssive Memoized version
 static int t[][] = new int[101][101]; 
 static int lcs(int x, int y, String s1, String s2){
     // your code here
   
     for(int arr[]:t){
         Arrays.fill(arr,-1);
     }
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
     System.out.println("Correct - ");
     i--;j--;
     ArrayList<Character> ar = new ArrayList<Character>();
     while(i>0 && j>0){
         if(s1.charAt(i-1)==s2.charAt(j-1)){
             ar.add(s1.charAt(i-1));
             i--;j--;
         }else{
             if(t[i-1][j]>t[i][j-1]){
                 i--;
             }else
             j--;
             
         }
     }Collections.reverse(ar);
     for(Character st : ar){
         System.out.print(st+ " ");
     }
     System.out.println();
     System.out.println("Wrong -");

     int count=0;
     for(int k =1; k<=x; k++){
         if(count<t[k][y]){
             count++;
             System.out.print(s1.charAt(k-1)+" ");
         }
     }System.out.println();
             System.out.println("----------------");

     return 0;
 }
}
