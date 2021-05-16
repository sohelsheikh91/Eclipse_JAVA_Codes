import java.util.*;
import java.lang.*;
class RecentCounter {
 Queue<Integer> li;
    public RecentCounter() {
      li = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        li.add(t);
        while(li.peek()<t-3000){
            li.remove();
        }
        li.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */