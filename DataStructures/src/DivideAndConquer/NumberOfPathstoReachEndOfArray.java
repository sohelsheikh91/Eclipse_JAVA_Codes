package DivideAndConquer;

public class NumberOfPathstoReachEndOfArray {
	static int count =0;
	public static void main(String[] args) {
		
		int arr2[][]={   {4,7,8,6,4},
						{4,7,8,6,4},
						{4,7,8,6,4},
						{4,7,8,6,4},
						{4,7,8,6,4}};
		int arr[][]={  {1,1,1}
						,{1,1,3}
						, {1,1,3}};
		int[][] arr1 = { 
				  { 4, 7, 1, 6 }, 
				  { 5, 7, 3, 9 }, 
				  { 3, 2, 1, 2 }, 
				  { 7, 1, 6, 3 } };
		int sum =0 ;
		int cost = 35;
		
		System.out.println("NumberOfPathstoReachEndOfArray in cost "+cost+" :"+
					MinPath(arr1, arr1.length-1,arr1[0].length-1, cost));
		
	}

	private static int MinPath(int[][] arr, int i, int j, int cost ) {

		if(i == -1 || j == -1) {
			return 0;
		}
		if(i == 0 && j ==0) {
			if(0==(cost- arr[i][j]) ) {
				return 1;
			}
			return 0;
		}
		if(0>cost- arr[i][j] ) {
			return 0;
		}
		int sum  = MinPath(arr,  i - 1, j,cost -  arr[i][j]); // arr[i][j] +MinPath(arr,  i - 1, j) makes value -ve, Dont use it
		int sum2 = MinPath (arr, i, j-1,cost -  arr[i][j]);
//		System.out.println(" i ="  + i+"  j = "+ j +" sum  ="  + sum +" sum2  ="  + sum);
		return  sum + sum2 ;	
	}
}
