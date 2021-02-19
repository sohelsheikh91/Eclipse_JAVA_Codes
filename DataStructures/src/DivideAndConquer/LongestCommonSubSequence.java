package DivideAndConquer;

public class LongestCommonSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "el";
		String str2  = "eetot7";
		int count = 0;
		System.out.println(LCS(str1,str2,count, 0, 0));
		
	}

	private static int LCS(String str1, String str2, int count, int i, int j) {
		// TODO Auto-generated method stub
		if(i> str1.length()-1 || j> str2.length()-1) {
			return count;
		}
		if(str1.charAt(i) == str2.charAt(j)) {
			i++; j++;
			return LCS( str1, str2, count + 1, i , j);
		}
		int c1= LCS( str1, str2, count, i , j+1);
		int c2= LCS( str1, str2, count, i+1 , j);
		int c3= LCS( str1, str2, count, i+1, j+1);
		return Math.max(Math.max(c1,c2),c3);
	}

}
