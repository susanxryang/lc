public class SumOfLeftLeaves {
  public static void main(String[] args) {
    
  }

  public static int sumOfLeftLeaves(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int sum = 0;
    if (root.left != null) {
      if (root.left.left == null && root.left.right == null) {
        sum = root.left.val;
      }
    }
    // if (root.right != null) {
    //   if (root.right.left != null || root.right.right != null) {
    //     sum += sumOfLeftLeaves(root.right);
    //   }
    // }
    return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
  }

  // public static int sumOfLeftLeavesHelper(TreeNode root, int sum) {
  //   if (root == null) {
  //     return 0;
  //   }
  //   if (root.left != null) {
  //     if (root.left.left == null && root.left.right == null) {
  //       sum += root.left.val;
  //       return sum;
  //     } else {
  //       sumOfLeftLeavesHelper(root.left, sum);
  //     }
  //   }
  //   if (root.right != null) {
  //     if (root.right.left != null || root.right.right != null) {
  //       sumOfLeftLeavesHelper(root.right, sum);
  //     }
  //   }

  //   return sum;
  // }
}