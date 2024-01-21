import java.util.*;

class ProductOfArrayExceptSelf {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    int[] result = productExceptSelf(nums);
    for (int i = 0; i < nums.length; i++){
      System.out.print(result[i]);
    }
  }

  public static int[] productExceptSelf(int[] nums) {
    int[] L = new int[nums.length];
    int[] R = new int[nums.length];

    L[0] = 1;
    for(int i = 1; i < nums.length; i++){
      L[i] = L[i - 1] * nums[i - 1];
    }
    R[nums.length - 1] = 1;
    for(int i = nums.length - 2; i >= 0; i--){
      R[i] = nums[i + 1] * R[i + 1];
    }


    for(int i = 0; i < nums.length; i++){
      nums[i] = R[i] * L[i];
    }
    
    return nums;
  }
}