import java.util.List;
import java.util.ArrayList;


public class GenerateParentheses {
  public static void main(String[] args) {
    int n = 3;
    System.out.println(generateParenthesis(n));
  }

  public static List<String> generateParenthesis(int n) {
    // count number of fronts and backs used
    // the number of fronts used must be less than back
    List<String> result = new ArrayList();
    backtrack(result, "", 0, 0 , n);
    // generate all possible combinations of this possible one and add

    return result;
  }

  public static void backtrack(List<String> result, String curr_str, int open, int close, int max) {
    if (curr_str.length() == max*2) { // added enough parenthesis
      result.add(curr_str);
      // some base case condition
      return;
    } if(open < max){
      backtrack(result, curr_str + "(", open + 1, close, max);
    } if(close < open){
      backtrack(result, curr_str + ")", open, close + 1, max);
    } 
  }

}