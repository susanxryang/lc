import java.util.*;

// incorrect
public class ThreeSum15 {
    public static void main(String[] args) {
      int[] nums = new int[]{-2,0,0,2,2};
      threeSum(nums);
    }
  
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(nums == null || nums.length < 3)
            return result;
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            
            int first = nums[i];
            int target = 0 - nums[i];
            int left = i+1;
            int right = nums.length - 1;
            
            while(left < right){
                if(left < right && nums[left] + nums[right] > target){
                    right--;
                }else if(left < right && nums[left] + nums[right] < target){
                    left++;
                }else{ //nums[left] + nums[right] == target
                    result.add(Arrays.asList(first, nums[left], nums[right]));
                    
                    left++;
                    right--;
                }
            }
        }
        
        return result;
    }
}

  