package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class wordFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, Integer> map = new TreeMap<String ,Integer>();
		
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("abc");
		list.add("bcd");
		list.add("abc");
		list.add("abc");
		list.add("bcd");
		list.add("abc");
		list.add("abc");
		list.add("bcd");
		list.add("abc");
		list.add("abc");
		list.add("bcd");
		list.add("abc");
		
//		Set<String> set = new HashSet<String>();
//		
//		set.add("abc");
//		set.add("bcd");
//		
//		
		for(String str :list ) {
		
		map.put(str,0);
			
		}
		System.out.println(map);
//		
		for(String str :list ) {
			
//		if(map.containsKey(str)) {
			
			map.compute(str,(key,val)-> val = val+1);
//		}
//		
		}
		
//		map.put("abc", map.getOrDefault("abc",0)+1);
//		map.put("abc", 10);
		System.out.println(map);
		
	}

}
