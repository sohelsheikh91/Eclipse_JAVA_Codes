package Hashinng;

import java.util.LinkedList;

public class Direct_Chaning {

	LinkedList<String>[] hashtable;
	Direct_Chaning(){
		
		hashtable = new LinkedList[13];
		
	}
	public  int createHash(String str,int M) {
		
		char a[] = str.toCharArray();
		int i , sum;
		for(i= 0,sum =0;i < a.length;i++) {
			sum = sum + a[i];
			
		}
		
		return sum%M;
		
	}
	
	public  void insert(String str) {
		int index = createHash(str,hashtable.length);
		
		
		if(hashtable[index]==null) {
			hashtable[index] = new LinkedList<String>();
			hashtable[index].add(str);
			
		}else {

			hashtable[index].add(str);
		}
	}
	public boolean search(String str) {
		int index = createHash(str,hashtable.length);
		
		System.out.println(str +"   "+index);
		if(hashtable[index]!=null && hashtable[index].contains(str)) {
			return true;
		}else {

			return false;
		}
	}
	public  void delete(String str) {
		int index = createHash(str,hashtable.length);
		
		
		if(hashtable[index]!=null && hashtable[index].contains(str)) {
			hashtable[index] = new LinkedList<String>();
			hashtable[index].remove(str);
		}else {

			System.out.println("Value not found");
		}
	}
	public void displayHashTable() {
		if(hashtable == null) {
			System.out.println("\nHashTable does not exits !");
			return;
		}else {
			System.out.println("\n---------- HashTable ---------");
			for (int i = 0; i < hashtable.length; i++) {
				System.out.println("Index: " + i + ", key: " + hashtable[i]);
				
			}
		}
	} 
	
}
