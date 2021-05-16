	import java.util.*;
	import java.lang.*;
	import java.io.*;

	class printUniqueSubset {
		public static void main (String[] args) {
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			
			while(t-->0){
				int n=sc.nextInt();
		        String input = "";
		        sc.nextLine();
		        String arr[] = sc.nextLine().split(" ");
		        for(int i = 0; i< n ; i++){
		            input += arr[i];
		        }
		       // Set<Integer> output = new Set<Integer>();
		        Set<String> all =  new TreeSet<String>();
	           
		        subset(input,"",all);
		        for(String st : all){
		            System.out.print("("+ st +")");
		        }
		        System.out.println();
		    }
		}
		public static void subset(String input,String output, Set<String> all){
		    if(input.length()==0){
		        all.add(output);
		       // System.out.print("("+ output+")");
		        return;    // Look carefully
		    }
		   
		    String op1= output;
		    String op2= output;
		    if(output.length()==0){ op2 += input.charAt(0);}
		        else {op2 += " " + input.charAt(0);} 
		    
		    input = input.substring(1); 
		    subset(input,op1,all);
		    subset(input,op2,all);
		    
		}
	}

