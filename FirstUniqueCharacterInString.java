import java.util.HashMap;

public class FirstUniqueCharacterInString {
  public static void main(String[] args) {
    String s = "leetcode";
    String s2 = "loveleetcode";
    System.out.println(firstUniqChar(s2));
  }

  public static int firstUniqChar(String s) {
    if(s.length() == 1){
      return 0;
    }
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++){
      char curr = s.charAt(i);
      if(!map.containsKey(curr)){
        map.put(curr, s.indexOf(curr));
      }else{
        map.put(curr, -1);
      }
    }
    int min = Integer.MAX_VALUE;
    for(Character curr : map.keySet()){
      if(map.get(curr) != -1 && map.get(curr) < min){
        min = map.get(curr);
      }
    }
    if(min == Integer.MAX_VALUE){
      return -1;
    }
    return min;
  }

}