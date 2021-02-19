import java.util.*;
class Geeks{
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        // your code here
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0; 
        for(int i = 0 ; i< n ; i++){
            map.put(a[i],map.getOrDefault(a[i],0) +1);
            String str1 = "" + i +(k-1)+ 1;
System.out.println(str1);
        }
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue()==f){
                count ++;              
            } 
        }
        
        System.out.println(count);
    }
}