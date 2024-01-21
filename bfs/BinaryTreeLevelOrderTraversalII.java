import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class BinaryTreeLevelOrderTraversalII {
  public static void main(String[] args) {
    
  }

  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    Stack<List<Integer>> stack = new Stack<List<Integer>>();
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);
    if (root == null) {
      return result;
    } 
    while(!queue.isEmpty()){
      int size = queue.size();
      LinkedList<Integer> list = new LinkedList<>();
      for (int i = 0; i < size; i++){
        TreeNode node = queue.pop();
        list.add(node.val);
        if(node.left != null) queue.add(node.left);
        if(node.right != null)queue.add(node.right);
      }
      stack.add(list);
    }
    while(!stack.isEmpty()){
      result.add(stack.pop());
    }
    return result;
  }
}