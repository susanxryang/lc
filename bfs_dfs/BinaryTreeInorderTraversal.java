import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
  public static void main(String[] args) {
    // int[] nums = {3,2,3,null,3,null,1};
    // System.out.println(rob(nums));
  }

  public static List<Integer> inorderTraversal(TreeNode root) {
    Stack<TreeNode> stack = new Stack();
    List<Integer> list = new ArrayList<>();
    while(!stack.isEmpty() || root != null){
      while(root != null){
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      list.add(root.val);
      root = root.right;
    }
    return list;
  }

}