import java.util.List;
import java.util.ArrayList;

public class RestoreIPAddresses {
  public static void main(String[] args) {
    String s = "25525511135";
    System.out.println(restoreIpAddresses(s));
  }

  public static List<String> restoreIpAddresses(String s) {
    List<String> result = new ArrayList();
    backtrack(result, s, "", 0);

    return result;
  }

  // no leading zero
  // less than 255

  public static void backtrack(List<String> result, String s, String curr_str, int subsec) {
    if (subsec == 4 && s.length() == 0) { // added enough digits
      result.add(curr_str.substring(1));
      return;
    } else if (subsec == 4 || s.length() == 0) { // added enough digits
      return;
    } else {
      // 1 digit
      backtrack(result, s.substring(1), curr_str + "." + s.substring(0, 1), subsec + 1);
      if (s.charAt(0) != '0' && s.length() > 1) { // 2 digit
        backtrack(result, s.substring(2), curr_str + "." + s.substring(0, 2), subsec + 1);
        if (s.length() > 2 && Integer.parseInt(s.substring(0, 3)) <= 255) { // 3 digit
          backtrack(result, s.substring(3), curr_str + "." + s.substring(0, 3), subsec + 1);
        }
      }

    }
    // while (curr_end <= s.length() + 4) {
    // String curr_num = s.substring(curr_start, curr_end);
    // if (Integer.parseInt(curr_num) < 255) {
    // backtrack(result, s, curr_str + curr_num, curr_start, curr_end + 1);
    // }
    // if (Integer.parseInt(curr_num) > 255) {
    // backtrack(result, s, curr_num + ".", curr_start + 1, curr_start + 1);
    // }
    // }
  }
}