public class HouseRobberII{
  public static void main(String[] args){
    int[] nums = {1,2,3,1};
    System.out.println(rob(nums));
  }
  public static int rob(int[] nums){
    // int[] rob = new int[nums.length];
    // int[] notRob = new int[nums.length];
    if(nums == null || nums.length == 0){
      return 0;
    } 
    if (nums.length == 1){
      return nums[0];
    }
    int rob_first = 0;
    int notRob_first = 0;
    int rob_noFirst = 0;
    int notRob_noFirst = 0;

    rob_first = nums[0];
    for (int i = 1; i < nums.length; i++){
      int pre_first = Math.max(notRob_first, rob_first); // not rob the current one
      rob_first = notRob_first + nums[i]; // rob the current one
      notRob_first = pre_first;

      int pre_noFirst = Math.max(notRob_noFirst, rob_noFirst);
      rob_noFirst = notRob_noFirst + nums[i];
      notRob_noFirst = pre_noFirst;
    }
    return Math.max(notRob_first, rob_noFirst);
  }



  public int rob1(int[] nums) {
    int[][] dp = new int[nums.length + 1][2];
    for (int i = 1; i <= nums.length; i++) {
        dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]); // not rob the current house, get the max of the previous house 
        dp[i][1] = nums[i - 1] + dp[i - 1][0]; // rob the current house, not rob the previous house
    }
    return Math.max(dp[nums.length][0], dp[nums.length][1]);
  }

  public int rob2(int[] nums) { // cannot rob both the first and last house
    int optRobFirst = nums[0];
    int prevRobFirst = 0;
    int optNotRobFirst = 0;
    int prevNotRobFirst = 0;

    for (int i = 0; i < nums.length - 1; i++) {
      int t1 = optRobFirst;
      optRobFirst = Math.max(prevRobFirst + nums[i], t); // set new opt value
      prevRobFirst = t1;


      int t2 = optNotRobFirst;
      optNotRobFirst = Math.max(prevNotRobFirst + nums[i], t); // set new opt value
      prevNotRobFirst = t1;

      // int t = opt;
      // opt = Math.max(prev + num, t); // set new opt value
      // prev = t;
    }
    return Math.max(optRobFirst, optNotRobFirst + nums[nums.length - 1]);
  }
}