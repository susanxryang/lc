public class MinDepth {
  public static void main(String[] args) {
    
  }

  public boolean minDepth(TreeNode root) {
    int count = 0;
    if (root == null) {
      return true;
    } else {
      return minDepthHelper(root, 1);
    }
  }

  public static int minDepthHelper(TreeNode root, int count){
    if(root == null){
      return 0;
    }
    else{
      count++;
      int leftDepth = minDepthHelper(root.left, count);
      int rightDepth = minDepthHelper(root.right, count);
      if(root.left == null){
        return rightDepth + 1;
      } else if(root.right == null){
        return leftDepth + 1;
      } else{
        return Math.min(leftDepth, rightDepth) + 1;
      }
    }
  }
}