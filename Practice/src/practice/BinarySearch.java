package practice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,2,3,6,5,4,7,8,9};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(search(a,0,a.length-1,12345));
		
	}

	private static int search(int[] a, int start, int end, int key) {
		// TODO Auto-generated method stub
			int middle=start + (end - start)/2;
			
			if(start>end)
				return -1;
			if(key > a[middle]) {
				
				return search(a,middle+1,end,key);
				
		
			}else if(key<a[middle]) {
				return search(a,start,middle,key);
				
			}else if(a[middle] == key)
			{return middle;}
			else
				return -1;
			
			
			
	}


}
