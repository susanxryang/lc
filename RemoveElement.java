import java.util.*;
// import sun.security.util.ArrayUtil;

class RemoveElement {
    public static void main(String[] args){
        int[] nums = {2};
        System.out.println(removeElement(nums, 3));
        for (int i=0; i<nums.length; i++) 
        System.out.print(nums[i]+" "); 
    }   

    public static int removeElement(int[] nums, int val) {  
        if(nums.length == 0){
            return 0;
        }
        
        int j = 0;
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val) {
                nums[j] = nums[i]; 
                j++;
            }
        }
        if(j == nums.length){
            return j;
        }
        nums[j] = nums[nums.length-1]; 

        return j; 
    }
}