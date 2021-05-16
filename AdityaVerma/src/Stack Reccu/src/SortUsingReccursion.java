
public class SortUsingReccursion {
	public static void main(String [] args) {
		
		int arr[]= {6,1,4,7,2,4,8,0};
		int ind = 0;
		sort(arr,ind);
		for(int n :arr)
		System.out.print(n+" ");
	}
	
	private static void sort(int[] arr, int ind) {
		// TODO Auto-generated method stub
		if(ind==arr.length)
		return;
		max(arr,ind);
		sort(arr,ind+1);
	}

	private static void max(int[] arr, int ind) {
		// TODO Auto-generated method stub
		if(ind==arr.length-1) {
			return;
		}
		int temp = arr[ind];
		max(arr,ind+1);
		if(arr[ind+1]<temp) {
			int t = arr[ind+1];
			arr[ind+1] = temp;
			temp  = t;
		}
		arr[ind] =temp;
		
		
	}
	
}
