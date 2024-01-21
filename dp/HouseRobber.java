public class HouseRobber {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 1 };
    System.out.println(rob(nums));
  }

  public static int rob(int[] nums) {
    // int[] rob = new int[nums.length];
    // int[] notRob = new int[nums.length];
    int rob = 0;
    int notRob = 0;
    for (int num : nums) {
      int pre = Math.max(notRob, rob); // not rob the current house
      rob = notRob + num; // rob the current house
      notRob = pre;
    }
    return Math.max(rob, notRob);
  }

  public static int rob1(int[] nums) {
    int opt = 0;
    int prev = 0;
    for (int num : nums) {
      int t = opt;
      opt = Math.max(prev + num, t); // set new opt value
      prev = t;
    }
    return opt;
  }
}