package Sorting;

public class Heap {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
		HeapSort hs = new HeapSort(arr);
		
		System.out.println("User entered Array: ");
		hs.printArray();
		System.out.println("\n");
		hs.sort();
		
		System.out.println("\n\nAfter sorting: ");
		hs.printArray();
	}
	
}
