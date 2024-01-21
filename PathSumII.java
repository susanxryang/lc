import java.util.List;

public class PathSumII {
  public static void main(String[] args) {
    
  }

  public static List<List<Integer>> hasPathSum(TreeNode root, int sum) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (root == null) {
      return result;
    } else{
      helper(root, sum, result, new ArrayList<Integer>());
      return result;
    }
  }
  
  public static void helper(TreeNode root, int remainder, List<List<Integer>> result, List<Integer> curr_list){
    curr_list.add(root.val);

    if(root.right == null && root.left == null){
      if(root.val == remainder){
        result.add(new ArrayList<Integer>(curr_list));
      }
      return;
    }
    int newSum = remainder - root.val;
    if(root.left != null){
      helper(root.left, newSum, result, curr_list);
    }
    if(root.right != null){
      helper(root.right, newSum, result, curr_list);
    }
    curr_list.remove(curr_list.size() - 1);

  }
}