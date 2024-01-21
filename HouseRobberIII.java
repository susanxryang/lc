public class HouseRobberIII{
   /**
   * Definition for a binary tree node.
   * public class TreeNode {
   *     int val;
   *     TreeNode left;
   *     TreeNode right;
   *     TreeNode() {}
   *     TreeNode(int val) { this.val = val; }
   *     TreeNode(int val, TreeNode left, TreeNode right) {
   *         this.val = val;
   *         this.left = left;
   *         this.right = right;
   *     }
   * }
   */
  public static void main(String[] args){
    // int[] nums = {3,2,3,null,3,null,1};
    // System.out.println(rob(nums));
  }

  public static int rob(TreeNode root){
    if(root == null){
      return 0;
    } 
    int[] result = robHelper(root);
    return Math.max(result[0], result[1]);
  }

  public static int[] robHelper(TreeNode root){
    // [0] is the max value if not rob the current house
    // [1] is the max value if rob the current house
    int[] result = new int[2];
    if(root == null){
      return result;
    }
    int[] left = robHelper(root.left);
    int[] right = robHelper(root.right);
    result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
    result[1] = left[0] + right[0] + root.val;
    return result;
  } 
}