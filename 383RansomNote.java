import java.util.HashMap;

public class RansomNote {
  public static void main(String[] args) {
    String ransomNote = "aa";
    String magazine = "ba";
    System.out.println(canConstruct(ransomNote, magazine));
  }

  public static boolean canConstruct(String ransomNote, String magazine) {
    if(ransomNote.length() > magazine.length()){
      return false;
    }
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < magazine.length(); i++){
      char curr = magazine.charAt(i);
      if(!map.containsKey(curr)){
        map.put(curr, 0);
      }
      map.put(curr, map.get(curr) + 1);
    }

    for (int i = 0; i < ransomNote.length(); i++){
      char curr = ransomNote.charAt(i);
      if(!map.containsKey(curr)){
        return false;
      }else if(map.get(curr) <= 0){
        return false;
      }
      map.put(curr, map.get(curr) - 1);
    }
    return true;
  }

}