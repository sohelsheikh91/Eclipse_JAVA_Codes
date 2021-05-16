// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStackInExtraSpace{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
			g.pop(s);
			
		System.out.println(g.min(s));
		}
	}
}// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
    public Stack<Integer> support ;
    GfG(){
        support = new Stack<Integer>();
    }
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    if(support.size()==0 || support.peek()>=a){  //corner case =
	      support.push(a); 
	    }
	    s.push(a);
	    
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            if(support.peek()==s.peek()){
                support.pop();
            }
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
		if(s.isEmpty()==true)
			return -1;
          return support.peek();
           
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