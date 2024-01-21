import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BinaryTreeLevelOrderTraversal {
  public static void main(String[] args) {
    
  }

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    if (root == null) {
      return result;
    } 
    while(!queue.isEmpty()){
      int size = queue.size();
      LinkedList<Integer> list = new LinkedList<>();
      for (int i = 0; i < size; i++){
        TreeNode node = queue.poll();
        list.add(node.val);
        if(node.left != null) queue.add(node.left);
        if(node.right != null)queue.add(node.right);
      }
      result.add(list);
    }
    return result;
  }

  // public static int levelOrderHelper(TreeNode root, int index, List<List<Integer>> result, ArrayList curr_list){
  //   if(){
  //     return null;
  //   }
  // }
}