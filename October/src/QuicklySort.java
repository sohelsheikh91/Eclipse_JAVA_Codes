
public class QuicklySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {10, 3, 2, 7, 7, 5, 8, 4, 1, 2, 9, 7, 8, 11};
		sort(array,0,array.length-1);
		for(int i: array){
			System.out.print(i+ " ");
		}
	}
	public static void sort(int [] array, int start, int end ) {
		if(start<end) {
			int p = pivot(array,start,end);
		
			sort(array,start,p-1);
			
			sort(array,p+1,end);
		}
	}
	
	private static int pivot(int[] array, int start, int end) {
		// TODO Auto-generated method stub
		int i = start-1;
		int pivot = end;
		for(int j = start; j<=pivot; j++ ) {
			
			if(array[j]<=array[pivot]) {
				i++;
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			
			}
			
		}
		return i;
	}


}
