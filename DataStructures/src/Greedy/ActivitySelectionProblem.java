package Greedy;

import java.util.ArrayList;
import java.util.Comparator;

public class ActivitySelectionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Activity>  act = new ArrayList<Activity>();
		act.add(new Activity("A1",0,6));
		act.add(new Activity("A2",3,4));
		act.add(new Activity("A3",1,2));
		act.add(new Activity("A4",5,8));
		act.add(new Activity("A5",5,7));
		act.add(new Activity("A6",8,9));
		
		Comparator<Activity> compare = new Comparator<Activity>() {

			@Override
			public int compare(Activity o1, Activity o2) {
				// TODO Auto-generated method stub
				return o1.getFinish() - o2.getFinish();
			}
			
		};
		for(int i=0;i<act.size();i++) {
			System.out.print(act.get(i).getName()+"  ");
				
		}
		System.out.println();
		System.out.println(act.size());
		act.sort(compare);
		
		
		
		//-------------------------
		Activity previous = null;
		System.out.println(act.size());
		
		for(int i=0;i<act.size();i++) {
			System.out.print(act.get(i).getName()+"  ");
				
			}
		System.out.println();
		previous = act.get(0);
		System.out.print(previous.getName()+" ");
		for(int i=1;i<act.size();i++) {
			
			
			if(act.get(i).getStart() >= previous.getFinish()) {
				
				System.out.print(act.get(i).getName()+" ");
				previous = act.get(i);
			}
			
			
		}
		
		
	}

}
