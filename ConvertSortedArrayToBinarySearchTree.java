public class ConvertSortedArrayToBinarySearchTree {
  public static void main(String[] args) {
    int[] nums = {-10,-3,0,5,9};
    // System.out.println(rob(nums));
  }

  public static TreeNode sortedArrayToBST(int[] nums) {
    if(nums.length == 0){
      return null;
    }
    return constructTreeFromArray(nums, 0, nums.length - 1);
  }

  public static TreeNode constructTreeFromArray(int[] nums, int left, int right) {
    if(left > right){
      return null;
    }
    int midpoint = left + (right - left)/2;
    TreeNode node = new TreeNode(nums[midpoint]);
    node.left = constructTreeFromArray(nums, left, midpoint - 1);
    node.right = constructTreeFromArray(nums, midpoint + 1, right);
    return node;
  }
}