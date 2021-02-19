/**Given a number x and two positions (from the right side) in 
the binary representation of x, write a function that swaps n 
bits at given two positions and returns the result. 
It is also given that the two sets of bits do not overlap.*/
public class Swap_Bits_in_Given_Number {
	public static void main (String[] args) {
	    int value = 47;
	    String binary = "000000"+Integer.toBinaryString(value);
	    System.out.println(binary);
	    char ch[] = binary.toCharArray();
	    int ind1 =ch.length -1 - 1 ;
	    int ind2 =ch.length - 1 - 5 ;
	    int n = 3;
	    for(int i = n ; i>0; i--){
	        char temp = ch[ind1 - i];
	        ch[ind1-i] = ch [ind2-i] ;
	        ch[ind2-i] = temp;
	        
	    }
	    int ans = Integer.parseInt(String.valueOf(ch),2);
	    
		System.out.println(ans + " (" + Integer.toBinaryString(ans) + ")" );
	}

/*int swapBits(unsigned int x, unsigned int p1, unsigned int p2, unsigned int n)
{
    /* xor contains xor of two sets *//*
    unsigned int xor = ((x >> p1) ^ (x >> p2)) & ((1U << n) - 1);

    /* To swap two sets, we need to again XOR the xor with original sets *//*
    return x ^ ( (xor << p1) | (xor << p2));
}*/

}
