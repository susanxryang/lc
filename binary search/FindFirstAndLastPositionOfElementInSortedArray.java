public class FindFirstAndLastPositionOfElementInSortedArray {
  public static void main(String[] args) {
    int[] nums = { 1};
    int target = 0;
    System.out.println(searchRange(nums, target));
  }

  public static int[] searchRange(int[] nums, int target) {
    int[] newArr = new int[2];
    int front = 0;
    int back = nums.length - 1;
    if(nums.length == 0){
      return new int[] { -1, -1 };
    }
    if(nums.length == 1){
      if(nums[0] != target){
        return new int[] { -1, -1 };
      } else{
        return new int[] { 0, 0 };
      }
    }

    while (front <= back) {
      if (nums[front] != target && nums[back] != target) {
        front++;
        back--;
      } else {
        if(nums[front] == target && nums[back] == target){
          break;
        }
        if (nums[front] == target) {
          // done searching front;
          back--;
        } else if (nums[back] == target) {
          // done searching front;
          front++;
        }
      }
    }
    newArr[0] = front;
    newArr[1] = back;

    if (nums[front] != target && nums[back] != target) {
      return new int[] { -1, -1 };
    }
    return newArr;
  }
}