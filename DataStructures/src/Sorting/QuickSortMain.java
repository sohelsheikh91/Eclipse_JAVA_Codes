package Sorting;

import java.util.Random;

public class QuickSortMain {

	public static void main(String[] args) {
		int array[] = {10, 3, 2, 7, 7, 5, 8, 4, 1, 2, 9, 7, 8, 11};
		System.out.println("User entered Array: ");
		QuickSort.printArray(array);
		long start = System.nanoTime();
		QuickSort.quickSort(array, 0, array.length-1);
		long end = System.nanoTime();
		System.out.println("\n\nTime to execute this algo: " + (end-start));
		
		System.out.println("\n\nAfter sorting: ");
		QuickSort.printArray(array);
	}//end of method

}//end of class