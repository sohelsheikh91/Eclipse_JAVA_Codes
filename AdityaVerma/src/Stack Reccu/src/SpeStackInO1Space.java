// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStackInO1Space{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG2 g=new GfG2();
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
			g.pop(s);
		System.out.println(g.min(s));
		" ".substring(1);
		}
	}
}// } Driver Code Ends


/*Complete the function(s) below*/
class GfG1{
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
		if(s.size()==0) {
			s.push(a);
			
		}else if(s.peek()<a) {
			int temp = s.pop();
			s.push(a);
			s.push(temp);
						
		}else
			s.push(a);
	    
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
		int a = s.pop();
		if(!(s.size()==0)) {
			int temp = s.pop();
			if(s.isEmpty()==false) {
			if(temp>s.peek()) {
				int sectemp = s.pop();
				s.push(temp);
				s.push(sectemp);
			}}else s.push(temp);
		}
		return a;
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
		if(s.isEmpty()==true)
			return -1;
          return s.peek();
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           if(s.size()==n)
           return true;
           else return false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           if(s.size()==0) return true;
           else return false;
	}
}

///////////

class GfG2{
	int min=0;
	public void push(int a,Stack<Integer> s)
	{
		if(s.isEmpty()==true) {
			s.push(a);
			min = a;
		}else if(a<min) {
			s.push((2 * a - min));
			min  = a;
		}else
			s.push(a);
		
	}
	public int pop(Stack<Integer> s)
    {
		if(s.isEmpty()==true)
			return -1;
		if(s.peek()< min) {     // also consider same no.s in input
			int temp = min;
			min = 2 * min -s.peek();
			return temp;
		}else
			return s.pop();
		
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
		if(s.isEmpty()==true)
			return -1;
          return min;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           if(s.size()==n)
           return true;
           else return false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           if(s.size()==0) return true;
           else return false;
	}
}
