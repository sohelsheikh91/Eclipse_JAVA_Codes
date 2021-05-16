import java.util.Stack;

public class sortAStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack= new Stack<Integer>();
		stack.push(1);
		stack.push(6);
		stack.push(4);
		stack.push(7);
		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(8);	
		sort(stack);
		for(int n :stack)
		System.out.print(n+" ");
	}
	private static void sort(Stack<Integer> stack) {
		// TODO Auto-generated method stub
		if(0==stack.size())
		return;
		int temp = stack.pop();
		sort(stack);
		insert(stack,temp);
	}

	private static void insert(Stack<Integer> stack, int temp) {
		// TODO Auto-generated method stub
		if(stack.size()==0 || stack.peek()<=temp) {
			stack.push(temp);
			return;
		}
		int a = stack.pop();
		insert(stack,temp);
		stack.push(a);
		
		
	}
}
