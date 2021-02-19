package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 5, 30, 15, 50, 6 };
		for(int i = 1; i< arr.length; i++) {
			int j = i;
			int temp = arr[i];
			while(j>0 && arr[j-1] > temp) {
				
				arr[j]=arr[j-1];
				j--;
		
				
			}
			arr[j] =temp;
			
		}
		for(int i = 0 ; i< arr.length;i++) {
			System.out.print(arr[i]+ " ");
			
		}
	}

}
