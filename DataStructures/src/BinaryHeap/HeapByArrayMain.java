package BinaryHeap;

public class HeapByArrayMain {

	public static void main(String[] args) {
		System.out.println("Creating a blank Heap");
		HeapCode heap = new HeapCode(10);
		
		heap.insertHeap(100);
		heap.insertHeap(90);
		heap.insertHeap(80);
		heap.insertHeap(70);
		heap.insertHeap(60);
		heap.insertHeap(50);
		heap.insertHeap(40);
		heap.insertHeap(30);
		heap.insertHeap(20);
		
		heap.ExtractHead();
		
		heap.insertHeap(110);
		heap.ExtractHead();
		
	}
}//end of class
