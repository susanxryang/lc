import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {
  public static void main(String[] args) {
    int[] candidates = { 2, 3, 6, 7 };
    int target = 7;
    System.out.println(combinationSum(candidates, target));
  }

  public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (candidates.length == 0) {
      return result;
    }
    Arrays.sort(candidates);
    backtrack(candidates, target, new ArrayList<Integer>(), result, 0);
    return result;
  }

  public static void backtrack(int[] candidates, int target, List<Integer> curr_list, List<List<Integer>> result,
      int index) {
    if (target == 0) { // added enough digits
      result.add(new ArrayList(curr_list));
      return;
    } else if (target > 0) {
      for (int i = index; i < candidates.length; i++) {
        if (candidates[i] > target) {
          break;
        }
        curr_list.add(candidates[i]);
        backtrack(candidates, target - candidates[i], curr_list, result, i);
        curr_list.remove(curr_list.size() - 1);
      }
    } 
  }
}