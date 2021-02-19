package DivideAndConquer;

public class LongestPalindromicSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "E2B1CBAE";
		String str2 = "elephant";
		int count = 0;
		System.out.println(LPS(str1,count, 0,str1.length()-1));
		
	}

	private static int LPS(String str1, int count, int i, int j) {
		
		if(i> j || j<1) {
			return count;
		}
		if(str1.charAt(i) == str1.charAt(j)) {
			i++; j--;
			return LPS( str1, count + 1, i , j);
		}
		
//		System.out.print("i = "+ i +"| j = "+ j);
		int c1 = LPS( str1, count, i , j-1);
		int c2 = LPS (str1, count, i+1, j);
		int c3 = LPS (str1, count , i+1, j-1);
		return Math.max(Math.max(c1, c2), c3);
	}
}
