import java.util.Stack;

public class deleteMiddleElementFromStack {
	public static void main(String [] agrs) {
		Stack<Integer> stack= new Stack<Integer>();
		stack.push(1);
		stack.push(6);
		stack.push(4);
		stack.push(7);
		stack.push(2);
		stack.push(4);
		stack.push(6);
			
		for(int n :stack)
			System.out.print(n+" ");
		System.out.println();
		if(stack.size()%2==0)
		sort(stack,(stack.size()/2)+1,2);
		else
		sort(stack,(stack.size()/2)+1,1);
		for(int n :stack)
		System.out.print(n+" ");
	}
	private static void sort(Stack<Integer> stack,int size,int c) {
		// TODO Auto-generated method stub
		if(stack.size()==size&&c==1) {
			stack.pop();
		return;
		}
		else if(stack.size()==size&&c==2) {
			stack.pop();
			stack.pop();
			return;
		}
		int temp = stack.pop();
		sort(stack,size,c);
		stack.push(temp);
	}
}
