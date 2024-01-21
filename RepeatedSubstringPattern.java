import java.util.*;

class RepeatedSubstringPattern {
    public static void main (String[] args){
        String s = "bb";
        System.out.println(repeatedSubstringPattern(s));
    }   

    public static boolean repeatedSubstringPattern(String s) {  
      int length = s.length();
      for (int i = length / 2; i >= 1 ; i--){
        if(length % i == 0){ // length of substring is divisible
          int num_repeats = length / i; // number of repeats
          String substring = s.substring(0, i);
          StringBuilder sb = new StringBuilder();
          for(int j = 0; j < num_repeats; j++){
            sb.append(substring);
          }
          if(sb.toString().equals(s)){
            return true;
          }
        }
      }

      return false;
    }
}