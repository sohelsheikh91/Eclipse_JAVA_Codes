package practice;

public class Vowel_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str = "hello World";
			char ar[]= str.toCharArray();
			String vowel = "aeiouAEIOU";	
			for(char c : ar) {
				String ch = String.valueOf(c);
				if(ch.matches("[aeiouAEIOU]"))
				System.out.print(c+" ");
				
			}
			System.out.println();
			for(char c : ar) {
				
				String ch = String.valueOf(c);
				if(vowel.contains(ch))
				System.out.print(c+" ");
				
			}
	}

}
