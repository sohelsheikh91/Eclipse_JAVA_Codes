package Sorting;

public class QuickSort {

	public static void printArray(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}

	public static void quickSort(int[] array, int i, int j) {
		// TODO Auto-generated method stub
		if(i< j ) {
			int p = partition(array,i,j);
			quickSort(array,i,p-1);
			quickSort(array,p+1,j);
			
		
		}
	}

	private static int partition(int[] array, int start, int end) {
		// TODO Auto-generated method stub
		int i =start-1;

		int p =end;
		
		
		for(int j = start; j<=p;j++) {
		
			if(array[j]<=array[p]) {
				i++;
				
				int temp = array[i];
				array[i]=array[j];
				array[j] =temp;	
				
			}
	
		}

		return i;
	}

}
