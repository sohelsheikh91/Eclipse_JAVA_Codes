// { Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new solve().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}



// } Driver Code Ends


class solve{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        Stack<Long> st = new Stack<Long>();
        long list[] = new long[n];
        long b[] = new long[n];
        int l = 0;
        for(int i = arr.length-1; i>=0; i--){
            if(st.size()==0){
                list[l++] = (long)-1;
                st.push((long)arr[i]);
                continue;
            }
            if(st.peek()>arr[i]){
                list[l++]=(long)st.peek();
                st.push((long)arr[i]);
            }else{
                st.pop();
                i++;
            }
        }
        int j= b.length;
        int a= 0,s = list.length-1;
        while(a<s){                         //No extra space
            long temp = list[a];
            list[a] = list[s];
            list[s] = temp;
            a++;
            s--;
        }
        for(long gh : list){                // Space Required N
            b[j-1] = gh;
            j--;
        }
        
        return list;
        
    } 
}