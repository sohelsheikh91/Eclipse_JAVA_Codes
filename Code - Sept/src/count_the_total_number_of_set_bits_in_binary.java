
public class count_the_total_number_of_set_bits_in_binary {
//----------------BigO(nLogn)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n = 1000000;
		    int count = 0;
		    int i = 0;
		    for(int j = 1; j <=n; j ++){
		        i=j;
		        while(i!=0){
		            if(i%2==1){
		                count++;
		            }
		            i = i>>1;
		            
		        }
		        
		    }
		    System.out.println(count);
		    
//2nd Solution-------------------------------------O(k*n)
			 n = 1000000;
			 i = 0;
			int ans = 0;
			
			while((1<<i)<= n){
			    boolean k = false;
			    
			    int change = 1<< i;
			    for(int j = 0; j<=n ;j++){
			        if(k==true)
			        ans+=1;
			        
			        if(change ==1){
			            k = !k;
			            
			            change = 1<<i;
			            
			        }
			        else{
			            change --;
			        }
			        
			    }
			    i++;
			    
			    
			}
			System.out.println(ans);
		    
	}

}
