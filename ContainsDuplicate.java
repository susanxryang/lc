import java.util.*;

class ContainsDuplicate {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    
    System.out.print(containsDuplicate(nums));
  }

  public static boolean containsDuplicate(int[] nums) {
    Set<Integer> contains = new HashSet<>();
    for (int i = 0; i < nums.length; i++){
      if(contains.contains(nums[i])){
        return true;
      }
      contains.add(nums[i]);
    }
    return false;
  }
}