package Sorting;
//import BinaryHeap.HeapCode;


public class HeapSort {

	int arr[];
	int sizeOfarray;
	
	public HeapSort(int[] arr) {
		// TODO Auto-generated constructor stub
		this.arr =arr;
		sizeOfarray = 0;
		
	}

	public void printArray() {
		// TODO Auto-generated method stub
		for(int i = 0 ;  i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

	public void sort() {
		// TODO Auto-generated method stub
		HeapCode heap = new HeapCode(arr.length);

		for(int i = 0 ;  i < arr.length ; i++) {
		heap.insertHeap(arr[i]);
	
		}
		for(int i = 0 ;  i < arr.length ; i++) {
			arr[i]=heap.ExtractHead();
			
		}
	}


}
