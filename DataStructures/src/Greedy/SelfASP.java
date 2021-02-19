package Greedy;

import java.util.ArrayList;
import java.util.Comparator;

public class SelfASP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Activity> list = new ArrayList<Activity>();
		list.add(new Activity("A1",0,6));
		list.add(new Activity("A2",3,4));
		list.add(new Activity("A3",1,2));
		list.add(new Activity("A4",5,7));
		list.add(new Activity("A5",5,8));
		list.add(new Activity("A6",9,10));
		for(Activity i : list) {
			System.out.print(i.getName()+" ");
		}
		System.out.println();

		
		Comparator<Activity> com = new Comparator<Activity>() {
			@Override
			public int compare(Activity o1, Activity o2) {
				// TODO Auto-generated method stub
				return o1.getFinish() - o2.getFinish();
			}
		};
		list.sort(com);
		for(Activity i : list) {
			System.out.print(i.getName()+" ");
		}
		System.out.println();
		Activity prev = null;
		prev = list.get(0);
		System.out.print(prev.getName()+" ");
		for(int i=1;i<list.size();i++) {
			if(prev.getFinish()<list.get(i).getStart()) {
				System.out.print(list.get(i).getName()+" ");
				prev = list.get(i);
			}
		}
	}

}
