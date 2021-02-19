package Hashinng;

public class DirectChainingMain {

	public static void main(String[] args) {

		// Constructor
		Direct_Chaning directChaining = new Direct_Chaning();

		directChaining.insert("The");
		directChaining.insert("quick");
		directChaining.insert("brown");
		directChaining.insert("fox");
		directChaining.insert("over");
		directChaining.insert("lazy");
		directChaining.displayHashTable();

		directChaining.insert("fox"); // use for showing collision
		directChaining.displayHashTable();

		directChaining.insert("fox"); 
		directChaining.displayHashTable();
		
		directChaining.insert("fox"); 
		directChaining.displayHashTable();
		
		directChaining.insert("fox"); 
		directChaining.insert("quick");
		directChaining.displayHashTable();
		

		/*
		 * DirectChaining.insertKeyInHashTable("fox"); 
		 * DirectChaining.displayHashTable();
		 * 
		 * DirectChaining.insertKeyInHashTable("fox"); 
		 * DirectChaining.displayHashTable();
		 * 
		 * DirectChaining.insertKeyInHashTable("fox"); 
		 * DirectChaining.displayHashTable();
		 * 
		 * DirectChaining.insertKeyInHashTable("fox"); 
		 * DirectChaining.displayHashTable();
		 * 
		 * 
		 * DirectChaining.searchKeyInHashTable("jump");
		 * DirectChaining.searchKeyInHashTable("brown");
		 * 
		 * 
		 * DirectChaining.deleteKeyFromHashTable("jump");
		 * DirectChaining.deleteKeyFromHashTable("quick");
		 * DirectChaining.displayHashTable();
		 * 
		 * 
		 * DirectChaining.deleteHashTable(); 
		 * DirectChaining.displayHashTable();
		 */

	}// end of method

}// end of class
