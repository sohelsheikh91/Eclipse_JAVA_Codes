package Greedy;

import java.util.Arrays;

public class SelfCC {
	
	int [] rupees;
	public SelfCC(int[] rupees) {
		this.rupees = rupees;
	}

	public int find(int value) {
		Arrays.sort(rupees);
		int count = 0;
		int i = rupees.length-1;
		while(i>=0) {
			if(value>=rupees[i]) {
				count ++;
				value = value - rupees[i];
				System.out.println(value);
			}else
			i--;
		}
		return count;
	}

}
