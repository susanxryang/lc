public class minSubArrayLen209 {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        System.out.print(minSubArrayLen(7, nums) + " ");
    }

    public static int minSubArrayLen(int target, int[] nums) {

        int i = 0;
        int j = 0;
        int count = Integer.MAX_VALUE;
        int sum = 0;
        while (j < nums.length) {
            sum = sum + nums[j];
            while (sum >= target) {
                count = Math.min(count, (j - i + 1));
                sum = sum - nums[i];
                i++;
            }
            j++;
        }
        if (count == Integer.MAX_VALUE) {
            return 0;
        } else {
            return count;
        }
    }
}