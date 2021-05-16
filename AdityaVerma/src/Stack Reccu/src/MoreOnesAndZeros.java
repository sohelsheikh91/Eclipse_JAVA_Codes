
public class MoreOnesAndZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		binarynumber("",0,0,3);
	}

	private static void binarynumber(String str, int one, int zero, int n) {
		// TODO Auto-generated method stub
		
		if(n==0) {
			
			System.out.println(str);
			return;
		}
		if(one>zero) {
			String op = str+"0";
			binarynumber(op,one,zero+1,n-1);
		}
		String op = str+"1";
		binarynumber(op,one+1,zero,n-1);
	}

}
