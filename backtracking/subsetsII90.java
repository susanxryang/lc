import java.util.*;

public class subsets78 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        // List<Integer> currSubset = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        // if (nums.length == 0)
        // return res;
        // currSubset.add(nums[0]);
        search(nums, 0, res, new ArrayList<>());
        return res;
    }

    public static void search(int[] nums, int index, List<List<Integer>> res, List<Integer> currSubset) {
        res.add(new ArrayList<Integer>(currSubset));

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1])
                continue;
            currSubset.add(nums[i]);
            search(nums, i + 1, res, currSubset);
            currSubset.remove(currSubset.size() - 1);
        }
    }
}
