package practice;
/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String Vcomp = bf.readLine();
        int N = Integer.valueOf(bf.readLine());
        ArrayList<String> list = new ArrayList<String>();
     
        for(int i = 0 ; i< N ; i++){
            list.add(bf.readLine());  
             
        }
        // System.out.println(list.size());
        for(int k = 0; k< list.size(); k++){
         
            int t[][] = new int[Vcomp.length()+1][list.get(k).length()+1];
         
            // for(int arr[]: t){
            //     Arrays.fill(arr,-1);
            // }
            int i = 0; int j =0;
            for( i = 0; i<Vcomp.length()+1; i++){
                for( j = 0; j<list.get(k).length()+1; j++ ){
                
                   if(i==0 || j==0){
                        t[i][j] = 0;
                   }
                }
//                System.out.println("runing");
            } 
            System.out.println("runing");
            for( i = 1; i<Vcomp.length()+1; i++){
                for( j = 1; j<list.get(k).length()+1; j++ ){
                
                   if(Vcomp.charAt(i-1)==list.get(k).charAt(j-1)){
                       t[i][j] = 1 + t[i-1][j-1];
                   }else{
                       t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
                   }
                }
            }
             System.out.println(list.size());
            if(t[i-1][j-1]==list.get(k).length()){
                System.out.println("POSITIVE");
            
            }else
                System.out.println("NEGATIVE"); 

        }

   }
}
