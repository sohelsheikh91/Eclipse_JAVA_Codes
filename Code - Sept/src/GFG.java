// { Driver Code Starts
//Initial Template for Java
/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;


 // } Driver Code Ends


//User function Template for Java


class Geeksy
{
    static void findPairs(long arr[],int n,long sum) 
    {
         //Your code here
        int count =0;
        for(int i = 0; i<n ; i++ ){
            for(int j = i+1; j< n; j++){
                if(arr[i]+arr[j] ==sum){
                     System.out.println(arr[i] +" "+arr[j]+" " + sum);
                     count ++;
                }
            }
        }
        if(count >0){
            System.out.println(-1);
        }
        //  int binary =(int) Math.pow(2,n);
        //  int caculatedSum = 0;
        //  StringBuilder pattern = new StringBuilder("") ;
        //  int count=0;
        // for(int i = 0; i<binary ; i++ ){
        //     for(int j = 0; j< n; j++){
        //         if(((i>>j)&1)%2 ==1){
        //             caculatedSum += arr[j];
        //             pattern = pattern.append(arr[j]+" ");
        //         }
             
        //     }   if(caculatedSum ==sum){
        //             System.out.println(pattern);
        //             count ++;
        //         }
                
        //     caculatedSum  = 0;
        //     pattern = new StringBuilder("");
            
        
           
            
        // }
        //     if(count >0){
        //       System.out.println(-1);

        //     }
        
        
    }  public static void freq(ArrayList<Character> clist, char c)
    {
     
        if(clist.contains(c))
        System.out.println(Collections.frequency(clist,c));
        else
        System.out.println("Not Present");
        
    }
}

// { Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    long arr[]=new long[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        long x=sc.nextLong();
		        arr[i]=x;
		    }
		    long sum=sc.nextLong();
		    Geeksy obj=new Geeksy();
		   obj.findPairs(arr,n,sum);
		    
		    
		}
		
	}
}
  // } Driver Code Ends