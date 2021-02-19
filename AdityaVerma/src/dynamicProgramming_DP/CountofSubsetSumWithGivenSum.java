package dynamicProgramming_DP;

public class CountofSubsetSumWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,2,3,4};
		int target = 10;
        int t[][]=new int[nums.length+1][target+1];    // Important
        int i =0;
        int j =0;
        for( i  = 0; i< nums.length+1; i ++){
           for( j = 0; j < target+1; j++){
               if(j ==0){
                   t[i][j] = 1;
                   continue;
               }else if (i == 0){
                   t[i][j] = 0;
                   continue;
               }
               if(nums[i-1]<=j ){
                   t[i][j] = t[i-1][j-nums[i-1]] + t[i-1][j];
               }else
                   t[i][j] = t[i-1][j];

           }
        }
       
        System.out.println(t[i-1][j-1]);
	}

}
