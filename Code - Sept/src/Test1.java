
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,1,3,2,5,1,4,7,6,9,4,5,1,2,3,3,5,6,4,5,4,5,1,0,0};
		int sum =0,curr= 0;
		for(int i= 0 ; i <arr.length-1; i++) {
			sum = 0;
			for(int j = i+1 ;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					curr = arr[i] + arr[j];
				}
				if(sum < curr  ) {
					sum = curr;
					System.out.println(arr[i]+", "+arr[j]);
					
				}
				curr=0;
			}
			sum= 0;
		}
	}

}
