import java.util.*;
// import sun.security.util.ArrayUtil;

class RemoveDuplicates {
    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.print(removeDuplicates(nums) + " " + nums);
        for (int i=0; i<nums.length; i++) 
        System.out.print(nums[i]+" "); 
    }   

    public static int removeDuplicates(int[] nums) {  
        if(nums.length == 0){
            return 0;
        }
        // To store index of next unique element 
        int j = 0; 

        for (int i=0; i < nums.length-1; i++) 
            if (nums[i] != nums[i+1]) {
                nums[j] = nums[i]; 
                j++;
            }
    
        nums[j] = nums[nums.length-1]; 
        j++;
        return j; 
    }
}