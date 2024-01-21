import java.util.*;

class findMin153 {
	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.print(findMin(nums) + " ");
	}

	public static int findMin(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
        if (nums.length == 1){
            return nums[0];
        }
		int front = 0;
		int back = nums.length - 1;
        int mid = (back - front) / 2 + front;
        // find the first element such that it's less than the first element of the array
		while (front < back) {
            mid = (back - front) / 2 + front;
            // nums[mid] > nums[back]
            if (nums[front] < nums[mid]){ // first part is sorted, so find inflection point in second part
                if (nums[mid] < nums[back]){
                    return nums[front];
                }
                    // # If we are here, it means the right part is also sorted. So now the left part is also sorted and right part is also sorted, So nums[low] will be the lowest
                    
                else{
                    front = mid + 1;
                }
                    // # If the right part is not sorted, so the min will lie in that range (the unsorted range)
                    
                // front = mid+1;
            }else{
                back = mid;
            }
		}
        
		return nums[mid];
	}
}