package Greedy;

import java.util.Arrays;

public class CoinChangeProblem {
	
	int [] arr;
	int small=0;
	int ans=0;
	int val = 0;
	public CoinChangeProblem(int[] rupees) {
		// TODO Auto-generated constructor stub
		arr = rupees;
		
	}
	
	public int find(int val) {
		// TODO Auto-generated method stub
		small= smallest(val);
		
//		 if(small == 0)
//				return 0;
		if(val-small ==0) {
			
			ans++;
			return ans;
	
		}else {
			val = val - small;
			ans++;
			return find(val);
			
		}
		
			
		
		
	}
	private int smallest(int val) {
		// TODO Auto-generated method stub
		if(val <1)
			return 0;
		int small = 0;
		
		for(int i =0; i< arr.length; i++) {
			if(arr[i]>=small && arr[i]<=val) {
				
				small = arr[i];
			}
		}
		return small;
	}
	

	
}
