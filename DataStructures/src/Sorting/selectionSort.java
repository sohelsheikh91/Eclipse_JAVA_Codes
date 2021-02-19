package Sorting;

public class selectionSort {

	public static void main(String[] args) {
		
		int arr[] = { 10, 5, 30, 15, 50, 6 };
		
		for(int i = 0; i< arr.length;i++) {
			int min = i;
			for(int j= i+1; j < arr.length;j++) {
				
				if(arr[j]<arr[min]){
					min = j;

				}	
			}
			
			if(min != i) {
				
				int temp = arr[min];
				arr[min]= arr[i];
				arr[i]= temp;
				
			}
		}
		for(int i = 0 ; i< arr.length;i++) {
			System.out.print(arr[i]+ " ");
			
		}
		
		
	}

}
