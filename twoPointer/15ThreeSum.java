import java.util.*;

class ThreeSum {
	public static void main(String[] args) {
    int[] nums = {1,1,1};
    // int[] nums = {-1,0,1,2,-1,-4};
    List<List<Integer>> result = threeSum(nums);
    System.out.println(result);
	}
  
  public static List<List<Integer>> threeSum(int[] nums) {
    ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
    if(nums == null || nums.length < 3) return res;
    int n = nums.length;
    int i = 0;
    Arrays.sort(nums);
    while(i < n - 2){
      int base = nums[i];
      int left = i + 1;
      int right = n - 1;

      while(left < right){
        int sum = base + nums[left] + nums[right];
        if (sum == 0){
          res.add(Arrays.asList(base, nums[left], nums[right]));
          left = moveRight(nums, left+1);
          right = moveLeft(nums, right-1);
        } else if (sum > 0){
          right = moveLeft(nums, right-1);
        } else{
          left = moveRight(nums, left+1);
        }
      }   
      i = moveRight(nums, i+1);
    }

    return res;
  }
  
  public static int moveLeft(int[] nums, int right){
    while(right == nums.length - 1 || (right >= 0 && nums[right] == nums[right+1])){
      right--;
    }
    return right;
  }

  public static int moveRight(int[] nums, int left){
    while(left == 0 || (left < nums.length && nums[left] == nums[left-1])){
      left++;
    }
    return left;
  }
}