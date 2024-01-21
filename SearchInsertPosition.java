import java.util.*;

class SearchInsertPosition {
    public static void main(String[] args){
        int[] nums = {1,3};
        System.out.print(searchInsert(nums, 1) + " hey");
    }   

    public static int searchInsert(int[] nums, int target) {  
      int front = 0;
      int back = nums.length - 1;
      while (front + 1 < back){
        int mid = (back - front)/2 + front;
        if(nums[mid] < target){
          front = mid;
        } else if(nums[mid] > target){
          back = mid;
        } else{
          return mid;
        }
      }

      if(target <= nums[front]){
        return front;
      } else if(target > nums[back]){
        return back + 1;
      } else{
        return back;
      }
    }
}