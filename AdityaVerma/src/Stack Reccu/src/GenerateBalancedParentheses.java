import java.util.ArrayList;
import java.util.LinkedList;

public class GenerateBalancedParentheses {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =0;
		LinkedList<String> list = new LinkedList<String>();
		generate("",3,3,list);
		for(String str : list) {
			System.out.println(str);
		}
		
	}
	public static void generate(String str, int open,int close,LinkedList<String> list) {
		 
		if(open==0 && close==0) {
			list.add(str);
//			System.out.println(str);
			return ;
		}
		if(open>0) {
			String op1 = str+"(" ;
			generate(op1,open-1,close,list);
		}
		if(open<close) {
			String op2 = str +")";
			generate(op2,open,close-1,list);
		}
		return;
	}
}
