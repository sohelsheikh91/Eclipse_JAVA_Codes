
// Java program to find the duplicate 
// elements in a Stream 
// using Collections.frequency() 
  
import java.util.*; 
import java.util.stream.*; 
  
public class CollectionsExamples { 
  
    // Function to find the 
    // duplicates in a Stream 
    public static <T> Set<T> 
    findDuplicateInStream(List<T> list) 
    { 
        // Return the set of duplicate elements 
        return
  
            // Get the stream from the list 
            list.stream() 
  
                // Count the frequency of each element 
                // and filter the elements 
                // with frequency > 1 
                .filter(i -> Collections.frequency(list, i) > 1) 
  
                // And Collect them in a Set 
                .collect(Collectors.toSet()); 
    } 
    
  
    public static void main(String[] args) 
    { 
    	  /**int index = Collections.binarySearch(list,val);*/
    	int arr[] = {10, 20, 30, 40, 50}; 

    	System.out.println("Original Array : " + Arrays.toString(arr)); 
    	
    	// Please refer below post for details of asList() 
    	// https://www.geeksforgeeks.org/array-class-in-java/ 
    	// rotating an array by distance 2 
    	Collections.rotate(Arrays.asList(arr),2); 
    	
    	System.out.println("Modified Array : " + 
    							Arrays.toString(arr)); 
    	 ArrayList<Integer> list1 = new ArrayList<Integer>();
//    	 ArrayList list23<Integer> = new ArrayList<>();
    	 ArrayList<Integer> list3 = new ArrayList<>();
    	 
    	 
    	 
    	 Integer arr[] = {2, 2, 4, 2, 3, 5, 5, 6};
    	 ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
    	 list.retainAll(list2);
    	 map.put(a[i],map.getOrDefault(a[i],0) +1);
    	 
    	 
    	 //Collection.frequency Always require ArrayList   -> not Arrays.asList(arr) 'cause Integer not int
    	  
         Integer arr[] = {10, 20, 20, 30, 20, 40, 50};   //Integer
         
         // Please refer below post for details of asList() 
         // https://www.geeksforgeeks.org/array-class-in-java/ 
         int freq = Collections.frequency(Arrays.asList(arr), 20); 
         
         
    	 for(Integer i: set2){
    	        
              if(Collections.frequency(list,i) == Collections.frequency(list2,i)){
                  common = true;
                  System.out.print(i+" ");
              }
          }
    	  list.containsAll(list2)
    	  
    	 Collections.reverse(list);
    	 System.out.print(list.lastIndexOf(5)); 
    	 
        // Initial stream 
    	 arr1.addAll(1, arr);
        List<Integer> list 
            = Arrays.asList(5, 13, 4, 
                            21, 13, 27, 
                            2, 59, 59, 34); 
  
        // Print the found duplicate elements 
        System.out.println( 
            findDuplicateInStream(list)); 

        // 10 is present at index 3. 
        int index = Collections.binarySearch(list, 10); 
        System.out.println(index); 
        Deque<Integer> deq2 = new LinkedList<Integer>();
        
  
        // 13 is not present. 13 would have been inserted 
        // at position 4. So the function returns (-4-1)  
        // which is -5. 
        index = Collections.binarySearch(al, 13); 
        System.out.println(index); 
        
        Collections.sort(list, Collections.reverseOrder());//whole phrase  // list.sort(Comparator<Activity>);
        
        list.clear();
        
        list.indexOf(4);//Duplicate vale time indexOf hi use krna not binary search
	    Set<String> hash
        = new HashSet<String>();
        hash.add("ss");
        hash.contains("ss");
        hash.remove("ss");
        Set set = new HashSet();
        Integer i =0; 
        Integer.parseInt(i);
        
        TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>(); 
        ts.add(new StringBuffer("A")); 
        ts.add(new StringBuffer("Z")); 
        ts.contains(check); //Not return index compare it with binary Search
        //list.contains(2);
        ts.pollFirst(); 
        ts.pollLast();//Poll Not POP
        System.out.println("Higher " + ts.higher(val)); 
        System.out.println("Lower " + ts.lower(val)); 
        
        LinkedList<String> ll = new LinkedList<>(); 
        ll.add(25); // Normal Linked List
        ll.push(25);// Work Like Stack
        ll.set(1, "For"); 
        arrayList.add(25);
        arrayList.set(0,35);
        
        Queue<Integer> q = new LinkedList<>();
        PriorityQueue<Integer>arr = new  PriorityQueue<Integer>();
      
        Deque <Integer> dq = new LinkedList<Integer>(q);
        
        TreeSet<Integer> hdset = new TreeSet<Integer>();
        hdset = (TreeSet<Integer>)ts.headSet(6);
        hdset = (TreeSet<Integer>)ts.tailSet(6);
        
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i:hm.keySet())//entrySet(), valueSet()
        {
            if(hm.containsKey(sum-i)&& i!=(sum-i))
            return 1;
        }
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue()==f){
                count ++;              
            } 
        }
        PriorityQueue<Pair> min = new PriorityQueue<Pair>();
        min.con
    } 
} 