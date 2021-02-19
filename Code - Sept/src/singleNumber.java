import java.util.*;
public class singleNumber
{
	public static void main(String[] args) {
	int arr[] ={7,3,3,3,3,3,3,3,3,4,5,6,8,3,4,5,6};
	Set set = new HashSet();
	List<Integer> list = new ArrayList<Integer>();
	   for(int i = 0 ; i < arr.length ; i ++){
	       if(set.add(arr[i])){
	           
	       }else{
	           list.add(arr[i]);
	       }
	   }
	   for(int i = 0 ; i < arr.length; i ++){
	       if(list.contains(Integer.valueOf(arr[i]))){
	           arr[i]= 0;
	       }
	       
	   }
	   for(int a : arr){
	       if(a!=0){
	           System.out.println(a);
	       }
	   }
	       
	  
	}

}
