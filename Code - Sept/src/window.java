import java.math.BigInteger;
import java.util.Arrays;

public class window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int arr[]= {1, 5,6};
	        int summer = 0;
	        boolean check = false;
	        int add = 0;
	        int bcount =(int) Math.pow(2,arr.length);
	        for(int count = 1 ; count <= bcount ; count++){
	           
	            for(int j = 0 ; j< arr.length; j ++){
	                if(BigInteger.valueOf(count).testBit(j)){
	                	  /**if (((i >> j) &1 ) %2 == 1) {*/
	                    add = add ^arr[j];
	                }
	            }
	           
	           
	        }
	        System.out.println(add);
	        String st1 = "Geeks";
	        String st2 = "eeGeskforGeeks";
	        
	        int res = 0, i;
	        for(i = 0; i < st1.length(); i++)
	            res ^= st1.charAt(i);
	            
	        for(i = 0; i < st2.length(); i++)
	            res ^= st2.charAt(i);
	            
	        System.out.print((char)res);

//	        You are given an array A of size N. All the elements of A, except one element, occur twice. You need to find the element that doesn't have its duplicate in A.
//	        5
//	        1 1 2 2 3
//	        6
//	        1 1 2 2 3 3
	        
	        long x=0;
	        for(int i=0;i<n;i++)
	        x=x^arr[i];
	        
	        if(x==0)
	        return -1;
	        else
	        return x;
	}

}
