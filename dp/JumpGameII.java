public class JumpGameII {
  public boolean jump(int[] nums) {
    // int len = nums.length;
    int index = 0;
    int step = 0;
    int currMax = 0;
    int nextMax = 0;
    while (index <= currMax) {
      while (index <= currMax) {
        nextMax = Math.max(reach, index + nums[index]);
        index++;
      }
      currMax = nextMax;
      step++;
      if (currMax >= nums.length - 1)
        return step;
    }
    return 0;
  }

  public boolean canJump2(int[] nums) {
    int len = nums.length;
    int currReach = 0;
    int maxReach = 0;
    int count = 0;
    for (int i = 0; i < len - 1; i++) { // must be within reach
      currReach = Math.max(currReach, i + nums[i]);
      if (i == maxReach) {
        count++;
        maxReach = currReach;
      }
      if (maxReach >= len - 1)
        return count;
    }
    return count;
  }
}