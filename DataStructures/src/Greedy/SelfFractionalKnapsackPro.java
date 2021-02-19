package Greedy;

import java.util.*;

public class SelfFractionalKnapsackPro {

	public static void main(String[] args) {
		ArrayList<FractionalKnapsackItem> list = new ArrayList<FractionalKnapsackItem>();
		int [] value = {6,2,1,8,3,5};
		int [] weight = {6,10,3,5,1,3};
		int ks = 20;
		//Add the user input data in Knapsack
		for(int i = 0; i<value.length;i++) {
			list.add(new FractionalKnapsackItem(i+1, value[i], weight[i]));
		}
		
		Comparator<FractionalKnapsackItem> compare = new Comparator<FractionalKnapsackItem>() {
			@Override
			public int compare(FractionalKnapsackItem f1, FractionalKnapsackItem f2) {
				
//				if(f1.getRatio() < f2.getRatio())
//					return 1;
//				if(f2.getRatio() > f1.getRatio())
//					return -1;
//				else
//					return 0;
				return (int)(f2.getRatio()*100- f1.getRatio()*100);
			}
		};
		list.sort(compare);
		System.out.println(list.toString());
	
		int i = 0;
		double totalValue = 0;
		for(i =0 ; i< list.size() ; i++) {
			if(ks > list.get(i).getWeight()) {
				ks = ks- list.get(i).getWeight();
				totalValue += list.get(i).getValue();
				System.out.println("Weight : " + list.get(i).getWeight()+ " Value : "+list.get(i).getValue());
			}else
				break;
			
		}
		if(i< list.size()) {
		totalValue += list.get(i).getRatio() * ks;
		System.out.println("Additional :"+list.get(i).getRatio() * ks);}
		System.out.println(totalValue);
//		int j = list.size()-1;
//		int total = 0 ;
//		int knapsack = 500;
//		int count =0;
//		double extra = 0;
//		int worth =0;
//		int usedWeight = 0;
//		while(j>0) {
//			if(total + list.get(j).getWeight()<=knapsack) {
//				total += list.get(j).getWeight();
//				worth += list.get(j).getValue();
//				count ++;
//			}else {
//			usedWeight = knapsack - total ;
//			extraValue = usedWeight* list.get(j).getRatio();
//			
//			}
//			j--;
//			if(total + extra) {
//				
//			}
//		}

	}

}
