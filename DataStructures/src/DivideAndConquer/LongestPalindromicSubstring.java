package DivideAndConquer;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "E1234567";
		String str2 = "elephant";
		int count = 0;
		System.out.println(LPS(str1,count, 0,str1.length()-1,0));
		
	}

	private static int LPS(String str1, int count, int i, int j, int sub) {
		
		if(i> j || j<1) {
			return sub;
		}
		if(str1.charAt(i) == str1.charAt(j)) {
			i++; j--;
			sub++;
			return LPS( str1, count + 1, i , j, sub);
		}else
			sub=0;
		
//		System.out.print("i = "+ i +"| j = "+ j);
		int c1= LPS( str1, count, i , j-1,sub);
		int c2 = LPS (str1, count, i+1, j,sub);
		int c3 = LPS (str1, count , i+1, j-1,sub);
		return Math.max(Math.max(c1, c2), c3);
	}
}
