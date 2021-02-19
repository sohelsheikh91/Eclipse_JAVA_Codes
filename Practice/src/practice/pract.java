package practice;


import java.util.Date;

import javax.swing.Spring;

public class pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double input= 23.25468;
		int a = 12345;
		String output2 = String.valueOf(a);
		String output = String.valueOf(input);
		String val = String.format("%.2f", input);
		input = Double.parseDouble(val);
		int inp =(int)input;
		
		output =String.valueOf(inp);
		input = Double.valueOf(output);
		
		
		 double data = 3452.345; 
		  
	        // convert into int 
	        int value = (int)data; 
		
		System.out.println(3);
		String str  = "How are you";
		String str1 = "are ";
		StringBuilder sd = new StringBuilder(str);
		StringBuilder sdr = new StringBuilder("");
		sd.reverse();
		String stt[] = str.split(" ");
		for(int i = stt.length-1 ; i >= 0; i--) {
			
			sdr.append(stt[i]);
			sdr.append(" ");
		}
		System.out.println(sdr);
		System.out.println(Math.abs(-8.0)+" "+output2);
		System.out.println(str.indexOf(str1));
		Date now = new Date(1561554154352L);
		String aa= Character.toString('a');
		System.out.println();
		StringBuilder sb = new StringBuilder("Good Morning");
		sb.insert(1, "Friend ");
		System.out.println(sb.toString());
		
	}

}
