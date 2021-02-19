import java.io.*;
import java.util.*;
import java.math.*;
public class SubsequenceSumbyGeneratingAllSubsqncOrSubeset {
	
		public static void main (String[] args) {
	        int arr[]= {1, 3, 7, 121, 2};
	        int sum = 5;
	        boolean check = false;
	        int add = 0;
	        int bcount =(int) Math.pow(2,arr.length);
	        for(int count = 1 ; count <= bcount ; count++){
	            add = 0;
	            for(int j = 0 ; j< arr.length; j ++){
	                if(BigInteger.valueOf(count).testBit(j)){
	                	  /**if (((i >> j) &1 ) %2 == 1) {*/
	                    add = add +arr[j];
	                }
	            }
	            if(sum == add){
	                check = true;
	            }
	        }
	        System.out.print(check);
		}
}

