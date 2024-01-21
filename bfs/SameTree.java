public class SameTree {
  public static void main(String[] args) {
    // int[] nums = {3,2,3,null,3,null,1};
    // System.out.println(rob(nums));
  }

  public static boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    } else if ((p == null && q != null) || (q == null && p != null) || p.val != q.val) {
      return false;
    } else {
      return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
  }
}