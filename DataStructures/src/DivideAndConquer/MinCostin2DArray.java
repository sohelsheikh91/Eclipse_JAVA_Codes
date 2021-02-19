package DivideAndConquer;

public class MinCostin2DArray {

	public static void main(String[] args) {
		
		int arr[][]={   {4,7,8,6,4},
						{4,7,8,6,4},
						{4,7,8,6,4},
						{4,7,8,6,4},
						{4,7,8,6,4}};
		int sum =0 ;
		System.out.println(MinPath(arr, arr.length-1,arr[0].length-1));
		
		
	}

	private static int MinPath(int[][] arr, int i, int j ) {
		// TODO Auto-generated method stub
		if(i == -1 || j == -1) {
			return Integer.MAX_VALUE;
		}
		if(i == 0 && j ==0) {
//			System.out.println(" sum  ="  + sum );
			return arr[0][0];
		}
		
		int sum  = MinPath(arr,  i - 1, j); // arr[i][j] +MinPath(arr,  i - 1, j) makes value -ve, Dont use it
		int sum2 = MinPath (arr, i, j-1);
		System.out.println(" i ="  + i+"  j = "+ j +" sum  ="  + sum +" sum2  ="  + sum);
		return arr[i][j] + Math.min(sum,sum2) ;

	}

}
