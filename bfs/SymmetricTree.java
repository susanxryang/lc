public class SymmetricTree {
  public static void main(String[] args) {
    // int[] nums = {3,2,3,null,3,null,1};
    // System.out.println(rob(nums));
  }

  public static boolean isSymmetric(TreeNode root) {
    // symmetric when: if same level are the same, go down level; if same level are different, compare symmetric
    if (root == null) {
      return true;
    } else {
      return isSymmetricHelper(root.left, root.right);
    }
  }

  public static boolean isSymmetricHelper(TreeNode left, TreeNode right){
    if(left == null && right == null){
      return true;
    } else if(left == null || right == null){
      return false;
    }else{
      return left.val == right.val && isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
    }
  }
}