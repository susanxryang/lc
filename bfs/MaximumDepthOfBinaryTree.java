public class MaximumDepthOfBinaryTree {
  public static void main(String[] args) {
    // int[] nums = {3,2,3,null,3,null,1};
    // System.out.println(rob(nums));
  }

  public static int maxDepth(TreeNode root) {
    int count = 0;
    if (root == null) {
      return count;
    } else {
      return Math.max(maxDepthHelper(root.left, count), maxDepthHelper(root.right, count));
    }
  }

  public static int maxDepthHelper(TreeNode sub, int count){
    count++;
    if(sub == null){
      return count;
    } else{
      return Math.max(maxDepthHelper(sub.left, count), maxDepthHelper(sub.right, count));
    }
  }
}