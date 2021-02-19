package practice;

public class FiboAndReccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n =5;
		System.out.println(recc(n)+ " "+fibo(n));
	}
	public static int recc(int n) {
		if(n ==0)
		return 1;
		return n*recc(n-1);
	}
	public static int fibo(int n) {
		if(n ==0 || n==1)
		return n;
		return fibo(n-1)+fibo(n-2);
	}

}
