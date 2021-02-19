
class Almost_Equals{
    
    static int coutChars(String s1, String s2)
    {
        String small,large;
        if(s1.length()>s2.length()){
            large =s1;
            small = s2;
        }else
        {
            small = s1;
            large = s2;
        }
        StringBuilder lr = new StringBuilder(large);
        StringBuilder sm = new StringBuilder(small);
        int len = 0;
        for(int i = 0; i< sm.length();i++){
            len = large.length();
            large = large.replaceFirst(String.valueOf(sm.charAt(i)),"");
            if(len!=large.length()){
                sm.deleteCharAt(i);
                i--;
            }
        }
        return large.length()+sm.length();
        
       //Your code here
    }
}
//Lesson - Always the read question carefully don't start jumping to solution 

class GeeksforGeeks{
    
    static int coutChars(String s1, String s2)
    {
        
        //creating an array to store
        //the frequency of each alphabet
        int hash[] = new int[26];
        
        //Increment frequency of alphabet
        for(int i = 0;i<s1.length();i++){
            hash[s1.charAt(i)-'a']++;
        }
        
        //Decrementing frequncy of alphabet
        for(int i = 0;i<s2.length();i++){
            hash[s2.charAt(i)-'a']--;
        }
        
        //initializing Extra Charcters 
        //count to 0
        int count = 0;
        
        //adding the absolute values to the 
        //Extra Character count
        for(int i = 0;i<26;i++){
            if(hash[i] != 0){
                count+=Math.abs(hash[i]);
            }
        }
        
        //returning Extra Charcater count
        return count;
    }
}