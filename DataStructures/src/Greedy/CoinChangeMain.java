package Greedy;

public class CoinChangeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rupees = new int[9];
		rupees[0]= 1;
		rupees[1]= 2;
		rupees[2]= 5;
		rupees[3]= 10;
		rupees[4]= 20;
		rupees[5]= 50;
		rupees[6]= 100;
		rupees[7]= 500;
		rupees[8]= 1000;
		CoinChangeProblem coin = new CoinChangeProblem(rupees);
		//SelfCC cc = new SelfCC(rupees);
		System.out.println(coin.find(458));
	}



}
