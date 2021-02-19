package Sorting;

public class MergeSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
		MergeSort.mergeSorter(arr,0,arr.length-1);
		for(int k= 0; k< arr.length; k++) {
				System.out.print(arr[k]+ " ");
		}
		
		}

}


