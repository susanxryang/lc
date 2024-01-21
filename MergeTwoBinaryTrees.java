import javax.swing.tree.TreeNode;

public class MergeTwoBinaryTrees {
  public static void main(String args[]) {

  }

  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    if (t1 == null) {
      return t2;
    }
    if (t2 == null) {
      return t1;
    }
    TreeNode n = new TreeNode();
    int val = t1.val + t2.val;
    n.val = val;
    n.left = mergeTrees(t1.left, t2.left);
    n.right = mergeTrees(t1.right, t2.right);
    return n;
  }

}