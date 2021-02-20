import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringsStreamsPattern {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str1 =new StringBuilder ("ABACD");
		
		StringBuilder str2 =new StringBuilder ("CDABAA");
		// String Builder is Better Than String
		str1.append(str1);
		if(String.valueOf(str1).contains(str2)) {
			System.out.println("yes");
			
		}else
			System.out.println("No");

		System.out.println(String.valueOf(str1).replace("AB", "CD"));
		int arr[] = {1,2,3,4,3,4,4,5};
		Set set = new HashSet();
		for (int a:arr) {
			
			if(set.add(a)) {
				
			}else
				System.out.println(a);
				
		}
		int arre[] = new int[10];
		System.out.println(arre.length);
		TreeSet tree = new TreeSet();
		int box[]  = {1,5,8,6,10};
		for(int b : box) {
			tree.add(b);
			if(tree.size()>4) {
				
				tree.pollFirst();
			}
		}
		System.out.println(tree.pollFirst());
		List list = (List<Integer>) tree.stream().collect(Collectors.toList());
		
		for(Object aarr : tree.toArray()) {

			System.out.println(" " + aarr);	
		}
		Arrays.sort(box);
		System.out.println("Easy = "+box[box.length-4]);
		
		int binary = 23;
		int count = 0,rem =0;
		int values[] = new int[100];
		while(binary !=0) {
			rem = binary%2;
			values[count++] = rem;
			binary /=2;
			
		}
		for(int i = count ; i>= 0 ; i--) {
			System.out.print(values[i]+" ");
		}
		TreeSet tree1 = new TreeSet();
		char[] ch = "batman".toCharArray();
		for(char ch1 : ch) {
			tree1.add(ch1);
		}tree1.add
		while(!tree1.isEmpty()) {
			System.out.print(" "+tree1.pollFirst());
		}
		String prac = "Sohel Sheikh Sohel SOhel";
		Set<String> set1 = new LinkedHashSet<String>();
		String pracList[] = prac.split(" ");
		for(String fu : pracList) {
			set1.add(fu);
		}
		for(String a :set1)
			System.out.println(a);
		Iterator it1 = set1.iterator();
		while(it1.hasNext())
			System.out.println(it1.next());
		Pattern pt = Pattern.compile("[aeiou]");
		Matcher mt= pt.matcher("sohelsheikh");
		System.out.println("sohelsheikh".replaceAll("[aeiou]",""));
		pt = Pattern.compile("[soj+]");
		mt= pt.matcher("sohelsheikh");
		System.out.println(mt.find());
		System.out.println(factorial(5));
		
	}
	static void checkString(String s)
    {
        int v=0;
        int c=0;
        
        //Your code here
        s = s.replaceAll(" ","");
        c = String.valueOf(s.replaceAll("[aeiou]","")).length();
        
        v = s.length()-c;
        
        
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
       System.out.print("Same");
        
        System.out.println();
    }
	/**
	 * @param n
	 * @return
	 */
	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		}
		else {
			return n*  factorial(n-1);
		}
		
	}
	

}
