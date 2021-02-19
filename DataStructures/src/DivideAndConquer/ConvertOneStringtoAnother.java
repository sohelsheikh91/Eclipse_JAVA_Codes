package DivideAndConquer;

import java.util.Scanner;

public class ConvertOneStringtoAnother {
	static Scanner in = new Scanner(System.in);
	
	static String one = "table";
	static String two = "tcblee";
	static int sum = 0; 
	public static void main(String[] args) {
		
		System.out.println(convert(0,0,sum,0));

	}

	private static int convert(int i, int j, int sum,int count) {
		if(count != one.length()-1 && i>one.length() &&j>two.length())
			return -1;
		if(i>one.length()-1 || j>two.length()-1) {
			if(j<=two.length()-1)
				return convert(i,++j,++sum,count);
			if(one.length()-1>=j)
				return convert(++i,++j,++sum,++count);
			return sum;
		}
		if(one.charAt(i) == two.charAt(j)) {
			i++;j++;
			count++;
			return convert(i,j,sum,count);
		}else if(one.charAt(i)!=two.charAt(j) && two.length()>one.length()){
			sum++;
			return convert(i,++j,sum,count);
		}else if(one.charAt(i)!=two.charAt(j) && two.length()<one.length()) {
			sum++;
			count++;
			return convert(++i,j,sum,count);
		}else if(one.charAt(i)!=two.charAt(j) && two.length()==one.length()) {
			sum++;
			count++;
			return convert(++i,++j,sum,count);
		}else
		return sum;
	}

}
