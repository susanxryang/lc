public class PathSum {
  public static void main(String[] args) {
    // int[] nums = {3,2,3,null,3,null,1};
    // System.out.println(rob(nums));
  }

  public static boolean hasPathSum(TreeNode root, int sum) {
    if (root == null) {
      return false;
    } else if(root.right == null && root.left == null && sum == root.val){
      return true;
    } else{
      return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
  }
  
  public static boolean helper(TreeNode root, int remainder){
    boolean right = false;
    boolean left = false;
    if(root == null && remainder != 0){
      return false;
    }
    if(root == null && remainder == 0){
      return true;
    }
    if (root.left != null) {
      left = helper(root.left, remainder - root.val);
    } 
    if (root.right != null) {
      right = helper(root.right, remainder - root.val);
    }
    
    return left || right;
  }
}