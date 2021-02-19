import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder str =new StringBuilder ("madam");
		System.out.println((String.valueOf(str.reverse()).equals("madam")));
		String str1 = String.valueOf(str),str2 ="madam" ;
		
		System.out.println(str1 == str2);//false
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i = 0 ; i< str.length() ; i++) {
		map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		
		}
		Set set = map.entrySet();
		Iterator<Map.Entry<Character,Integer>> itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry<Character,Integer> map1 = itr.next();
			System.out.println(map1.getKey() +"  "+map1.getValue()+", ");
			
		
		}
		String name = "ABCDEFG";
		int rot = 3;
		int left = 3;
		StringBuilder sb =new StringBuilder ("");
		StringBuilder sb2 =new StringBuilder ("");
		while(rot<name.length() ) {
			
			sb.append(name.charAt(rot));
			rot++;
			
		}
		for(int i =0 ; i<left; i++ ) {
			sb.append(name.charAt(i));
			
		}
		
		rot = name.length() - left;
		left = 3;
		
		while(rot < name.length() ) {
			
			sb2.append(name.charAt(rot));
			rot++;
			
		}
		for(int i = 0 ; i<name.length() - left; i++ ) {
			sb2.append(name.charAt(i));
			
		}
		System.out.println(sb+"\n"+sb2);
		rot = 3;
		left = name.length();
		StringBuilder sb3 =new StringBuilder (name);
		StringBuilder sb4 =new StringBuilder (name);
		for(int i= 0 ; i< name.length(); i ++) {
			sb3.setCharAt((i+rot)%name.length(),name.charAt(i));
			sb4.setCharAt((left+i-rot)%name.length(),name.charAt(i));
		}
		System.out.println(sb3+"\n"+sb4);
	}

}
