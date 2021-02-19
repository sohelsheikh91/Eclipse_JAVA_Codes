package practice;

import java.util.ArrayList;

public class ListInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("abc");
		ar.add("bcd");
		ar.add("bbb");
		ar.add("cde");
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		for(String a:ar) {
			
			list.add(new ArrayList<String>());
		}
		for(String a:ar) {
			
			
			char ch = a.charAt(0);
			int temp = ch- 97;
			list.get(ch-97);
			if(list.get(ch-97)==null) {
				
				list.add((ch-97),new ArrayList<String>());
				list.get((int)(ch-97)).add(a);
			}
			else {
				list.get(ch-97).add(a);
			}
		}
		for(ArrayList<String> ab : list)
			
			System.out.println(" "+ab.toString());
		
	}

}
