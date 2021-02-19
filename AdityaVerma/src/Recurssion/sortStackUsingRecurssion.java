package Recurssion;

import java.util.Stack;

public class sortStackUsingRecurssion {
	public static void main(String [] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st.toString());
		reverse(st);
		System.out.println(st.toString());

	}

	private static void reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.size()==0) {
			return;		
		}	
		int a =st.pop();
		reverse(st);	
		insert(st,a);
		
	}
	private static void insert(Stack<Integer> st,int n) {
		if(st.size()==0) {
			st.push(n);
			return;
		}		
		int a =st.pop();
		insert(st,n);
		st.push(a);
	}
	
	
}
