public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 1, 0, 3, 12 };
        moveZeroes(arr);
        System.out.println(arr);
    }

    public static void moveZeroes(int[] nums) {
        // int find_zero = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                // do nothing
            } else {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}