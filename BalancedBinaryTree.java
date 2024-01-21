public class BalancedBinaryTree {
  public static void main(String[] args) {
    
  }

  public boolean isBalanced(TreeNode root) {
    int count = 0;
    if (root == null) {
      return true;
    } else {
      // int diff = Math.abs(isBalancedHelper(root.left, 1) - isBalancedHelper(root.right, 1));
      return isBalancedHelper(root, 0);
    }
  }

  public static int isBalancedHelper(TreeNode root){
    if(root == null){
      return 0;
    }
    else{
      int leftDepth = isBalancedHelper(root.left);
      int rightDepth = isBalancedHelper(root.right);
      if(leftDepth == -1 || rightDepth == -1){
        return -1;
      }
      int diff = Math.abs(leftDepth - rightDepth);
      if (diff > 1){
        return -1;
      }
      return Math.max(leftDepth, rightDepth) + 1;
    }
  }
}