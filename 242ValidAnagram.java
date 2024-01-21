import java.util.*;

public class ValidAnagram{
  public static void main(String[] args){
  String s = "rat";
  String t = "car";
  System.out.println(isAnagram(s, t));
  }

  public static boolean isAnagram(String s, String t) {
    if(s.length() != t.length()){
      return false;
    }
    char[] origArr = s.toCharArray();
    HashMap<Character,Integer> record = new HashMap<>();
    for(char letter : origArr){
      if(!record.keySet().contains(letter)){
        record.put(letter, 0);
      }
      record.put(letter, record.get(letter)+1);
    }

    char[] matchArr = t.toCharArray();
    for(char letter : matchArr){
      if(!record.keySet().contains(letter)){
        return false;
      }else if(record.get(letter) == 0){
        return false;
      }else{
        record.put(letter, record.get(letter)-1);
      }
    }
    return true;
  }
}