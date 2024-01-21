public class searchRange34 {
  public static void main(String[] args) {
    int[] nums = { 5,7,7,8,8,10 };
    int target = 8;
    int[] result = searchRange(nums, target);
    System.out.println(result);
  }

  public static int[] searchRange(int[] nums, int target) {

    // find the first occurence, find minimum index with target
    int first_left = 0;
    int first_right = nums.length - 1;
    int first = -1;
    // int first_mid = first_left + (first_right - first_left) / 2;
    while (first_left <= first_right) {
      int first_mid = first_left + ((first_right - first_left) / 2);

      if (nums[first_mid] < target) {
        first_left = first_mid + 1;
      } else if (nums[first_mid] > target) {
        first_right = first_mid - 1;
      } else {
        first = first_mid;
        first_right = first_mid - 1;
      }
    }

    // find the last occurence, find maximum index with target
    int last_left = 0;
    int last_right = nums.length - 1;
    int last = -1;
    // int last_mid = last_left + (last_right - last_left) / 2;
    while (last_left <= last_right) {
      int last_mid = last_left + ((last_right - last_left) / 2);

      if (nums[last_mid] < target) {
        last_left = last_mid + 1;
      } else if (nums[last_mid] > target) {
        last_right = last_mid - 1;
      } else {
        last = last_mid;
        last_left = last_mid + 1;
      }
    }
    

    return new int[] { first, last };
  }
}