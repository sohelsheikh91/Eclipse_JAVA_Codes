package Sorting;

public class MergeSort {

	public static void mergeSorter(int[] arr, int i, int length) {
		// TODO Auto-generated method stub
		if(length>i) {
			int middle = (i+length)/2;
			
			mergeSorter(arr,i,middle);
			mergeSorter(arr,middle+1,length);
			
			merger(arr,i,middle,length);
			
		}
		
	}

	private static void merger(int[] arr, int i, int middle, int length) {
		// TODO Auto-generated method stub
		int left[]= new int[middle-i+2];
		int right[]= new int[length-middle+1];
		
		for(int ii =0; ii<=middle-i;ii++) {
			left[ii] = arr[i+ii];
		}
		
		for(int ii =0;ii<length-middle;ii++) {
			right[ii] =arr[middle+1+ii];
		}
/*Added Extrra vales to fail extra if condition*/		left[middle-i+1]= Integer.MAX_VALUE; //Merge values and insert into Array 'A'
		right[length-middle] = Integer.MAX_VALUE;
		int a =0;
		int b= 0;
		
	/*If Stating value is 4 then thats why k =i*/	for(int k= i; k<= length; k++) {

			
			if(left[a]<right[b]) {
				arr[k] = left[a];
				a++;	
			
			}else {
				arr[k] = right[b];
				b++;
			}
			
		}
	
	}
}