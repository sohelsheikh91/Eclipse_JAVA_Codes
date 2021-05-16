
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new solve().getMaxArea(arr, n));
		}
	}
}



// } Driver Code Ends


class solve{
    
    // Function to calculate max rectangular area histogram
    // hist[]: input array
    // n: size of array
    public static long getMaxArea(long hist[], long n)  {
        // your code here
        Stack<pair> stack = new Stack<pair>();
        long STL[] = new long[n];
        long GTL[] = new long[n];
        long Area[] = new long[n];
        int l=0;
        for(long i = 0; i< n ; i ++){
            
            if(stack.size()==0){
                stack.push(hist[i], i);
                STL[l++] = -1;
                continue;
                
            }
            if(stack.peek().getValue() < hist[i]){
                STL[l++] = stack.peek().getKey();
                stack.push(hist[i],i);
                
            }else{
                stack.pop();
                i--;
            }
        }
        l=0;
        stack = new Stack<pair>();
        for(long i = n-1 ; i>= 0; i--){
            if(stack.size()==0){
                stack.push(hist[i], i);
                GTL[l++] = -1;
                continue;
            }
            if(stack.peek().getValue() > hist[i]){
                GTL[l++] = stack.peek().getKey();
                stack.push(hist[i],i);
                
            }else{
                stack.pop();
                i++;
            }
        }
        for(int i = 0; i < n ; i++){
            Area[i] = (GTL[i] - STL[i] - 1) * hist[i];
            
        }
        long max  = 0;
        int i = 0;
        while(i<n){
            
            if(hist[i]>max){
                max = hist[i];
            }
            i++;
            
        }
        return max;
        
    }
        
}
class pair{
    long a;
    long b;
    
    pair(long a, long b){
        this.a = a;
        this.b = b;
    }
    public long getValue(){
        return a;
    }
    public long getKey(){
        return b;
    }
}
