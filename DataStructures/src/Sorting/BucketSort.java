package Sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import OriSort.MergeSort;

public class BucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = new int[100];
		
		//Generating 100 random numbers in the range of 0-100
		Random random = new Random();
		for(int i=0;i<100;i++) {
			arr[i] = random.nextInt(100)+100;
		}
		

		
		long start = System.nanoTime();
		
	
		int bucket = (int) Math.ceil(Math.sqrt(arr.length));
		ArrayList<ArrayList> buck = new ArrayList<ArrayList>();
		for(int i = 0 ; i< bucket ; i++) {
			buck.add(new ArrayList<Integer>());
		}
		int max = arr[0];
		
		for(int i = 0; i< arr.length;i++) {
			if(max<arr[i]) {
				
				max = arr[i];
			}
		}
		
		for(int i=0; i< arr.length; i++ ) {
			double bucketNO =  Math.ceil(((double)arr[i]*bucket)/max);
			buck.get((int) bucketNO -1).add(arr[i]);
			
		}
		Comparator<Integer> compare = new Comparator<Integer>() {
			
			

			@Override
			public int compare(Integer arg0,Integer arg1) {
				// TODO Auto-generated method stub
				return arg0 - arg1;
			}

			
		};
		
		for(int i=0; i< buck.size(); i++ ) {
			buck.get(i).sort(compare);
			for(int j = 0; j<buck.get(i).size();j++) {
				
				System.out.print(" "+buck.get(i).get(j));
				
			}
			
		}
		long end = System.nanoTime();
		System.out.println("\n\nTime to execute this algo: " + (end-start));
	}

}
