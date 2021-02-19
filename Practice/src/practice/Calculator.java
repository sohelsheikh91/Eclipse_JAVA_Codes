package practice;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		StringBuilder str = new StringBuilder("*+-");
	//													 <--*->
		StringBuilder cal = new StringBuilder("15441+2*5*123*12*14*15*16*18");// choises and descions so Stack
		for(int i = 0 ; i< str.length();i++) {
			for(int j = 0;j< cal.length();j++) {
				char ch = str.charAt(i);
				char ch1 = cal.charAt(j);
				if(ch == ch1) {
					int ind= j-1;
					int inx = j+1;
					StringBuilder start = new StringBuilder("");
					StringBuilder end = new StringBuilder("");
					while((ind >-1)&&!str.toString().contains(""+cal.charAt(ind))) {
						start.append(cal.charAt(ind));
						ind--;
					}
					start.reverse();
					while( !( inx >=cal.length())&& !str.toString().contains(""+cal.charAt(inx)) ) {
						end.append(cal.charAt(inx));
						inx++;
					}
					
					String temp =calculate(""+cal.charAt(j),start.toString(),end.toString());
					cal.replace(ind+1, inx, temp);
					System.out.println(cal);
				}
				
			}
			
		}
		System.out.println(cal);
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		 long start = System.nanoTime();
	System.out.println(calculator2Stack.calculate("15441+2*5*123*12*14*15*16*18"));
	long end = System.nanoTime();
	System.out.println(end - start);
	}

	private static String calculate(String op, String first, String last) {
		// TODO Auto-generated method stub
		Integer ans;
		if(op.equals("+")) {
			ans =Integer.valueOf(first) +Integer.valueOf(last);
			return ans.toString();
		
		}else if (op.equals("*")) {
			
			ans =Integer.valueOf(first) * Integer.valueOf(last);
			return ans.toString();
		}else if  (op.equals("-")) {
			
			ans =Integer.valueOf(first) - Integer.valueOf(last);
			return ans.toString();
		}
		return "0";
	}

}
