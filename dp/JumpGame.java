public class JumpGame {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int reach = 0;
        for(int i=0; i<=reach; i++){ // must be within reach
            reach = Math.max(reach, i+nums[i]);
            if(reach >= len-1)  return true;
        }
        return false;
    }
}