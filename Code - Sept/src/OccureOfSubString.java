import java.util.*;
import java.io.*;
import java.lang.*;

public class OccureOfSubString {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String string = bf.readLine();
		String str = bf.readLine();
		int cunt =0;
		System.out.println(Arrays.stream(string.split(" ")).filter(s -> s.contains(str)).count());
		int last = 0;

		while(last != -1) {
		last = string.indexOf(str, last);
		if(last !=-1) {
		cunt++;	
		last += str.length();
		}
		
		}
		System.out.println(cunt);
	}

}
