import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class practise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		a=Integer.parseInt( Integer.toBinaryString(a));
		int count = 0;
		while(a!=0) {
			System.out.println(a&1);
			if(a%10==1) {
				count++;
			}
			a/=10;
		}
		BigInteger.valueOf(10).testBit(0);
		
		System.out.println(count);
	}

}
