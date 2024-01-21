public class TrimBinarySearchTree {
  public static void main(String[] args) {
    
  }

  public TreeNode trimBST(TreeNode root, int low, int high) {
    if(root == null){
      return root;
    } else if(root.val < low){
      return trimBST(root.right, low, high);
    } else if(root.val > high){
      return trimBST(root.left, low, high);
    } else{
      root.left = trimBST(root.left, low, high);
      root.right = trimBST(root.right, low, high);
      return root;
    }
  }
  // if current node is less than low then move its first working right child to its place
  // if current node is more than high then move its first working left child to its place
}