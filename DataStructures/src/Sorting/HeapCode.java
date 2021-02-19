package Sorting;

public class HeapCode {
	int arr[];
	int sizeOfHeap ;
	public HeapCode(int val) {
		
		arr = new int[val+1];
		sizeOfHeap=0;
		
	}
	public void insertHeap(int value) {
		
		arr[sizeOfHeap+1] = value;
		sizeOfHeap++;
		heapifyBottomToTop(sizeOfHeap);
		
	}
	private void heapifyBottomToTop(int size) {
		// TODO Auto-generated method stub
		int parent = size/2;
		if(size<=1) {
			return;
		}
		
		if(arr[size]<arr[parent]) {
			int temp = arr[size];
			arr[size] = arr[parent];
			arr[parent] = temp;
			heapifyBottomToTop(parent);
		}
		
		
	}
	public int ExtractHead() {
		
		int head = arr[1];
		arr[1]= arr[sizeOfHeap];
		sizeOfHeap--;
		heapifyTtoB(1);
		return head;
		
	}
private void heapifyTtoB(int index) {
		
		
		
	}
}
