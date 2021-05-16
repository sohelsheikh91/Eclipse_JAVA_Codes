// { Driver Code Starts
/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;

class NearestGreaterToLeft {
    
	public static void main (String[] args) throws IOException {
		
			long[] res = {1,3,2,4};
		    new solve1();
			res = solve1.nextLargerElement(res,4);
		    for (int i = 0; i < 4; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
	}
}
class solve1{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        Stack<Long> st = new Stack<Long>();
        long list[] = new long[n];
        long b[] = new long[n];
        int l = 0;
        for(int i =0; i<n; i++ ) {
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
                i--;
            }
        }
//        int j= b.length;
//        int a= 0,s = list.length-1;
//        while(a<s){                         //No extra space
//            long temp = list[a];
//            list[a] = list[s];
//            list[s] = temp;
//            a++;
//            s--;
//        }
//        for(long gh : list){                // Space Required N
//            b[j-1] = gh;
//            j--;
//        }
        
        return list;
        
    } 
}