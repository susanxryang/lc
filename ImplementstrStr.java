import java.util.*;
// import sun.security.util.ArrayUtil;

class ImplementstrStr {
    public static void main (String[] args){
        String haystack = "aaaaaa";
        String needle = "bba";
        System.out.println(strStr(haystack, needle));
    }   

    public static int strStr(String haystack, String needle) {  
        if(needle.length() == 0){
            return 0;
        }
        int size = needle.length();
        // char[] convertStack = haystack.toCharArray();
        for (int i = 0; i < haystack.length() && (i+size)<=haystack.length(); i++){
            String compare = haystack.substring(i, i + size);
            if(compare.equals(needle)){
                return i;
            }
        } 
        
        return -1;
    }
}