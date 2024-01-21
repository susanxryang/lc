import java.util.*;

class TwoSum {
    public static void main(String[] args) {
        // int[] nums = { 2, 7, 11, 15 };
        // int[] result = twoSum(nums, 9);
        int[] nums = { 3, 2, 3 };
        int[] result = twoSum(nums, 6);
        System.out.print(result[0] + "," + result[1] + " hello world");
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int remainder = target - nums[i];
            if(sum.containsKey(remainder)){
                return new int[]{map.get(remainder), i};
            }else{
                sum.put(curr, i);
            }
        }
        return null;
    }
}