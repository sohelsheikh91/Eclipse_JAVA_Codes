package OriSort;

import java.util.Random;

public class MergeSortMain {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] array=new int[100];
		for(int i=0;i<100;i++) {
			array[i] = random.nextInt(100)+100;
		}
		
		
		System.out.println("User entered Array: ");
		MergeSort.printArray(array);
		
		long start = System.nanoTime();
		MergeSort.mergeSort(array, 0, array.length-1);
		long end = System.nanoTime();
		System.out.println("\n\nTime to execute this algo: " + (end-start));
		
		System.out.println("\nAfter sorting: ");
		MergeSort.printArray(array);
	}//end of method

}//end of class
