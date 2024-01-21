public class ValidateBinarySearchTree {
  public static void main(String[] args) {
    // int[] nums = {3,2,3,null,3,null,1};
    // System.out.println(rob(nums));
  }

  public static boolean isValidBST(TreeNode root) {
    if (root == null) {
      return true;
    } else{
      return (isValidBSTHelper(root, null, null));
    }
  }

  public static boolean isValidBSTHelper(TreeNode root, Integer min, Integer max) {
    if (root == null) {
      return true;
    } 
    if ((max != null && max <= root.val) || (min != null && min >= root.val)) {
      return false;
    } else {
      return isValidBSTHelper(root.left, min, root.val) && isValidBSTHelper(root.right, root.val, max);
    }
  }
}