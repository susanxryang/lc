import java.util.*;

class SearchRotatedArray {
	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.print(searchInsert(nums, 2) + " ");
	}

	public static int searchInsert(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int front = 0;
		int back = nums.length - 1;
		while (front <= back) {
			int mid = (back - front) / 2 + front;
			if (nums[mid] == target) {
				return mid;
			} 
			if (nums[front] < nums[mid]) {
				if (nums[front] <= target && nums[mid] >= target) {
					back = mid-1;
				} else {
					front = mid+1;
				}
			} else {
				if (nums[back] >= target && nums[mid] <= target) {
					front = mid+1;
				} else {
					back = mid-1;
				}
			}
		}

		return -1;
	}
}