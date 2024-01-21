import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Permutations {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3 };
    System.out.println(permute(nums));
  }

  public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    backtrack(result, new ArrayList<Integer>(), nums, new HashSet<Integer>());
    // generate all possible combinations

    return result;
  }

  public static void backtrack(List<List<Integer>> result, List<Integer> curr_list, int[] nums, HashSet<Integer> set) {
    if (curr_list.size() == nums.length) { // added enough parenthesis
      result.add(new ArrayList<Integer>(curr_list));
      // some base case condition
      return;
    } else {
      for (int i = 0; i < nums.length; i++) {
        if (!set.contains(nums[i])) { // add to list
          curr_list.add(nums[i]);
          int last = curr_list.size() - 1;
          set.add(nums[i]);
          backtrack(result, curr_list, nums, set);
          curr_list.remove(last);
          set.remove(nums[i]);
        }
      }
    }
  }

}