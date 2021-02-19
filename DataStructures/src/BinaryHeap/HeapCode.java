package BinaryHeap;

public class HeapCode {
	int heap[];
	int sizeOfHeap;
	public HeapCode(int size) {
		
		heap = new int[size+1]; 
		 sizeOfHeap = 0;
		
	}
	public int peekHeap() {
		
		if(heap==null) {
			
			System.out.println("Its Empty");
		}else {
			
			return heap[1];
		}
		return 0;
		
	}
	
	public int sizeOfHeap() {
		
		return sizeOfHeap;
		
	}
	public int insertHeap(int val) {
		
		
		if(heap==null) {
			
			System.out.println("Its Empty");
		}else {
			
			heap[sizeOfHeap+1]= val;
			sizeOfHeap++;
			
			heapifyBtoT(sizeOfHeap);
			levelorder();
		}
		return 0;
		
	}
	
	private void heapifyBtoT(int index) {
		// TODO Auto-generated method stub
			if(index<=1) {
				return;
				
			}
			int parent = index/2;
			if(heap[index]< heap[parent]) {
				int temp =heap[index];
				heap[index] = heap[parent];
				heap[parent] = temp;
			
				heapifyBtoT(parent);
			}
	}
	private void heapifyTtoB(int index) {
		
		int left = index * 2;
		int right = index * 2 + 1;
		int smallest  = 0;
		
		if(sizeOfHeap<left) {
			return;
			
		}else if (sizeOfHeap==left) {
			
			if(heap[index]>heap[left]) {
				int temp =heap[index];
				heap[index] = heap[left];
				heap[left] = temp;
			}
			return;
			
		}else {
			if(heap[left]<heap[right]) {
				smallest = left;
			}else{
				
				smallest = right;
					
			}
		if(heap[index]>heap[smallest]) {
					int temp =heap[index];
					heap[index] = heap[smallest];
					heap[smallest] = temp;
					}
			
			
		}
		heapifyTtoB(smallest);
		
		
		
	}
	public void levelorder() {
		
		for(int i = 1 ; i<=sizeOfHeap ;i++) {
			
			System.out.print(heap[i]+" ");
		}
		System.out.println()
		
		;
	}
	public int ExtractHead() {
		if(sizeOfHeap==0) {
			
			System.out.println("Its Empty");
		}else {
			System.out.println("Extracting" +" "+heap[1]);
			int extract = heap[1];
			heap[1] = heap[sizeOfHeap];
			sizeOfHeap--;
			heapifyTtoB(1);
			System.out.println("Sucessfully Extracted");
			levelorder();
			return extract;
		}
		return 0;
			
		 
		
	}
	
	
}
