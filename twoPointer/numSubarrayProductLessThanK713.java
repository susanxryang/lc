public class numSubarrayProductLessThanK713 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.print(numSubarrayProductLessThanK(nums, 0) + " ");
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1)
            return 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int prod = 1;
        while (j < nums.length) {
            prod = prod * nums[j];
            while (prod >= k) {
                prod = prod / nums[i];
                i++;
            }
            count = count + (j - i + 1);
            j++;
        }

        return count;
    }
}
