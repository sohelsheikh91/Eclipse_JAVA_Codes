package DivideAndConquer;

import java.util.ArrayList;
import java.util.Comparator;

import Greedy.FractionalKnapsackItem;

public class ZeroOneKnapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<FractionalKnapsackItem> list = new ArrayList<FractionalKnapsackItem>();
		int [] value = {6,2,1,8,3,5};
		int [] weight = {6,10,3,5,1,3};
		//Add the user input data in Knapsack
		for(int i = 0; i<value.length;i++) {
			list.add(new FractionalKnapsackItem(i+1, value[i], weight[i]));
		}
		
		Comparator<FractionalKnapsackItem> compare = new Comparator<FractionalKnapsackItem>() {
			@Override
			public int compare(FractionalKnapsackItem f1, FractionalKnapsackItem f2) {
				return (int)(f2.getRatio()*100- f1.getRatio()*100);
			}
		};
		list.sort(compare);
		int knapsack = 20;
		System.out.println(ks(list, knapsack, 0));
	}
	public static int ks(ArrayList<FractionalKnapsackItem> list,int knsack, int index) {
		
		if(index >= list.size())
			return 0;
		int currentWeight  = list.get(index).getWeight();
		int currentValue =  list.get(index).getValue();
		if( currentWeight > knsack) {
			return 0;
		}
		return  Math.max(currentValue + ks(list, knsack - currentWeight ,index +1), 0 + ks(list,knsack,index +1));
		
		
	}

}
