package trie;

import java.util.HashMap;
import java.util.Map;



public class trieCode {
		

	public class TrieNode {
		
		Map<Character,TrieNode> children ;
		Boolean EndOfWord;
		
		public TrieNode() {
			children = new HashMap<>();
			EndOfWord = false;
			
		}
		
	}
	private final TrieNode root;
	
	public trieCode() {
		
		root = new TrieNode();
		
	}
	public void insert (String word) {
		
		TrieNode current = root;
		for(int i = 0 ; i< word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			if(node == null) {
				node = new TrieNode();
				current.children.put(ch,node);				
			}
			current = node;	
		}
		current.EndOfWord = true;
		System.out.println("The Current "+word+" is Succesfully ");
	}
	public Boolean search(String word) {
		
		TrieNode current = root;
		for(int i = 0 ; i< word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			if(node == null) {
				System.out.println("Not Found");	
				return false;
			}
			current = node;	
		}
		if(current.EndOfWord == true)
			System.out.println("The "+word +"is Succesfully Found Here");
		else
			System.out.println("Not Found");	
		return current.EndOfWord;	
	}
	public void delete (String word) {
		if(search(word)==true) {
			
			delete1(root,word,0);
		}
	}
	private boolean delete1(TrieNode parent, String word, int index) {
		// TODO Auto-generated method stub
		char ch = word.charAt(index);
		TrieNode current = parent.children.get(ch);
		
		boolean ThisNodeCanBeDelete;
	
		if(current.children.size() > 1) {
			
			delete1(current,word,index+1);
			return false;	
			
		}
		
		if(index == word.length() - 1 ) {
			
			if(current.children.size() >=1) {
				
				current.EndOfWord=false;
				return false;
			}else {
				
				System.out.println("The character "+ch+" is to be Delete ");
				parent.children.remove(ch);
				return true;
			}
			
		}
		
		if(current.EndOfWord==true) {
			System.out.println("Case 3");
			delete1(current,word,index+1);
			return false;
					
		}
		
		System.out.println("EnteringCase#1");
		
		ThisNodeCanBeDelete = delete1(current,word,index+1);
		
		if(ThisNodeCanBeDelete==true) {
			
			parent.children.remove(ch);
			return true;
			
		}else {
			
			return false;
			
		}
		
	}
	
	
}
