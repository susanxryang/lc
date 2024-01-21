import java.util.*;

public class GroupAnagrams{
  public static void main(String[] args){
  String[] strs = {"eat","tea","tan","ate","nat","bat"};
  System.out.println(groupAnagrams(strs));
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    if(strs.length == 0){
      return new ArrayList<>();
    }
    HashMap<String, ArrayList<String>> record = new HashMap<>();
    for(String str : strs){
      char[] arr = str.toCharArray();
      Arrays.sort(arr);
      String sorted = String.valueOf(arr);
      if(!record.containsKey(sorted)){
        record.put(sorted, new ArrayList<>());
      }
      record.get(sorted).add(str);
    }
    return new ArrayList<>(record.values());
  }
}