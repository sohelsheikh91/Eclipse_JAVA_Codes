import java.util.LinkedList;

public class josephus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i<40; i++) {
			list.add(i+1);
		}
		problem(0,6,list);
	}

	private static void problem(int i, int j,LinkedList<Integer> list) {
		// TODO Auto-generated method stub
		if(list.size()==1) {
			System.out.println(list.get(0));
			return;
		}
		i =  (i + j )%list.size();
		list.remove(i);
		problem(i, j, list);
	}


}
