
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class LetterCombinationsOfAPhoneNumber {
  public static void main(String[] args) {
   System.out.println(letterCombinations(""));
  }

  public static List<String> letterCombinations(String digits) {
    Map<String, String> phone = new HashMap<String, String>() {
      {
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
      }
    };

    List<String> result = new ArrayList<String>();
    if(digits.length() == 0){
      return result;
    }

    backtrack(phone, result, digits, "", 0, digits.length());
    return result;
  }


  public static void backtrack(Map<String, String> phone, List<String> result, String digits, String curr_str, int place, int max) {
    if (curr_str.length() == max) { // added enough digits
      result.add(curr_str);
      return;
    } else {
      String curr = "" + digits.charAt(place);
      String available = phone.get(curr);
      for(int i = 0; i < available.length(); i++){
        String str = curr_str + available.charAt(i);
        backtrack(phone, result, digits, str, place + 1, digits.length());
      }
    }
  }
}