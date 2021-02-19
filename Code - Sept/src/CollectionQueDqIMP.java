/*package whatever //do not write package name here */

import java.util.*;

class CollectionQueDqIMP {
	public static void main (String[] args) {
	    Set<Integer> sorted = new TreeSet<Integer>();
		System.out.println(sorted.size());
				 
		PriorityQueue <Integer> pq  = new PriorityQueue<>();
		pq.add(6);
		pq.add(5);
		pq.add(3);
		pq.add(4);
		System.out.print(pq.peek() + " " + pq.size());
		 
		ArrayList <String> list = new ArrayList<>();
		list.add("geeks");
		list.add("for");
		list.add("geeks");
		Collections.sort(list);
		System.out.println(list); 
		Deque<Integer> deq = new LinkedList<Integer>();
		deq.push(3);
		deq.push(4);
		deq.push(5);
		System.out.println(deq.pop() + " " + deq.size());
		System.out.println(deq.peek() + " " + deq.size()); 
		Deque<Integer> deq1 = new LinkedList<Integer>();
		deq.add(3);
		deq.add(4);
				
		Iterator itr = deq.iterator();
		while(itr.hasNext())
		{
		   System.out.print(itr.next() + " ");
		}
		System.out.println();
		deq1.push(2);
		deq1.push(9);
		deq1.push(0);
		deq1.push(6);	deq1.push(8);
		deq1.push(7); 
		Iterator itr1 = deq1.iterator();
		while(itr1.hasNext())
		{
		   System.out.print(itr1.next() + " ");
		} 
		System.out.println();
		deq1.poll();deq1.remove();deq1.pop(); // All Same to pop last use deq1.pollLast();.removeLast();
		
		itr1 = deq1.iterator();
		while(itr1.hasNext())
		{
		   System.out.print(itr1.next() + " ");
		}
		System.out.println();
		ArrayList <Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(5);
		list1.add(2);
		list1.add(1);
		list1.add(6);
		System.out.println(Collections.binarySearch(list1, 2) + " ");
		Collections.sort(list1);
		System.out.println(Collections.binarySearch(list1, 2)); 
		 
		Deque<Integer> deq2 = new LinkedList<Integer>();
		deq1.push(3);
		deq1.push(4);
		deq1.push(5);
		
		Iterator itr11 = deq1.descendingIterator();
		while(itr11.hasNext())
		{
		   System.out.print(itr11.next() + " ");
		} 
		//test2
		
		////test1
		//       while(arr.size()!=0){
		//            System.out.print(arr.peek() + " ");
		//            arr.remove();
		//        }
		////test
		//      Deque <Integer> dq = new LinkedList<Character>(list1);
	   int count =0;
	   System.out.println();
       while(deq.size()!=0){
           if(count%2 ==0)
           System.out.println(deq.poll());
           else
           System.out.println(deq.pollLast());
           count++;    
       }
	}
}