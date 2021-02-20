class Pair implements Comparable<Pair>{
    int value;
    int freq;
    Pair(int value, int freq){
        this.value = value;
        this.freq = freq;
    }
    Pair(int value){
        this.value = value;
    }
    
//     @Override
//     public boolean equals(Object o){
        
//         Pair p = (Pair) o;
        
//         if(this.value == p.value) return true;
//         else return false;
        
//     }
    @Override
    public int compareTo(Pair o){
        return this.freq - o.freq;
    }
}
class Solution
{
    public int[] topKFrequent(int[] nums, int k)
    {
        // Code here

        
        PriorityQueue<Pair> min = new PriorityQueue<Pair>();
        // ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(Integer i : nums){
            //list.add(i);
            hm.put(i,hm.getOrDefault(i,0)+1);
            set.add(i);
        }
       
        for(Integer i : set){
     
            // if(min.contains(new Pair(nums[i]))){
            //     continue;         // Not Adding Duplicate Elements to heap
            // }
            //min.add(new Pair(ii, Collections.frequency(list,ii)));
            min.add(new Pair(i, hm.get(i)));
            if(min.size() > k){
                min.poll();
            }
        }
        
        int arr[] = new int[k];
        int idx = 0;  
        
        
        while(min.size()!=0){
            // System.out.println(min.peek().value +" "+ min.peek().freq);
            arr[idx++] = min.poll().value;
        }
        return arr;
        
        
    }
}