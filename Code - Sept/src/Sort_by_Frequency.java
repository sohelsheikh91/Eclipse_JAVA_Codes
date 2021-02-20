
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
/// 
class Sort_by_Frequency {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-- > 0){
		    int n = in.nextInt();
		    in.nextLine();
		    String str[] =in.nextLine().split(" ");
		    int arr[] = new int[n]; int a=0;
		    for(String i : str){
		        arr[a++] = Integer.parseInt(i);
		    }
		    int ans [] = solve(arr);
		    for(int i : ans){
		        System.out.print(i +" ");
		    }
		    System.out.println();
		}
		
	}
	//New Code is in Book and LEETCODE
	public static int[] solve(int arr[]){
	    PriorityQueue<Pair> max = new PriorityQueue<Pair>(Collections.reverseOrder());
	    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	   // Arrays.sort(arr);
	    for(Integer i : arr){
	        hm.put(i, hm.getOrDefault(i,0)+1);
	    }
	    
	    for(Integer i : hm.keySet()){
	        max.add(new Pair(i,hm.get(i)));
	    }
	    int i =0;
	    int ans [] = new int[arr.length];
	    while(max.size()!=0){
	        Pair pr = max.poll();
	        for(int j = 0 ; j< pr.freq; j++){
	        ans[i++] = pr.value;
	       }
	    }
	    return ans;
	}
}
class Pair implements Comparable<Pair>{
    int value;
    int freq;
    Pair(int value, int freq){
        this.value = value;
        this.freq = freq;
    }
    public int compareTo(Pair p){
        if(this.freq != p.freq || p==null)
        return this.freq - p.freq;
        else
        return p.value - this.value;
        
    }
}


//////////////////////////Another Way


HashMap<integer,integer> hs=new HashMap<>();
for(int i:arr)
hs.put(i,hs.getOrDefault(i,0)+1);

PriorityQueue<integer> pq=new PriorityQueue<integer>((a,b)-> {
if(hs.get(a)!=hs.get(b)) return hs.get(b)-hs.get(a);
else return a-b;
});
pq.addAll(hs.keySet());

while(!pq.isEmpty())
{
int curr=pq.remove();
for(int i=0;i<hs.get(curr);i++) system.out.print(curr+"="" ");="" }<="" code="">