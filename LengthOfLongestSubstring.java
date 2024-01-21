import java.util.*;
// import sun.security.util.ArrayUtil;

class LengthOfLongestSubstring {
    public static void main(String[] args){
        String s = "pww";
        System.out.print(lengthOfLongestSubstring(s) + " ");
    }   

    public static int lengthOfLongestSubstring(String s) {  
        if(s.length() == 0){
            return 0;
        }
        int front = 0;
        int back = 0;
        int max = 0;
        HashSet<Character> hash_set = new HashSet<>();

        while(back < s.length()){
          if(!hash_set.contains(s.charAt(back))){
            hash_set.add(s.charAt(back));
            back++;
            max = Math.max(hash_set.size(), max);
          } else{
            hash_set.remove(s.charAt(front));
            front++;
          }
        }
        
        return max; 
    }
}