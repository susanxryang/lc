import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
  public static void main(String[] args) {
    // int[] nums = {3,2,3,null,3,null,1};
    // System.out.println(rob(nums));
  }

  public static List<String> binaryTreePaths(TreeNode root) {
    List<String> paths = new ArrayList<>();
    if (root == null) {
      return paths;
    } 
    helper(root, "", paths);
    return paths;
  }
  
  public static void helper(TreeNode root, String path, List<String>paths){
    path = path + root.val;
    if(root.right == null && root.left == null){ // is leaf
      paths.add(path);
    }
    if(root.left != null){
      helper(root.left, path + "->", paths);
    } if(root.right != null){
      helper(root.right, path + "->", paths);
    }
  }
}