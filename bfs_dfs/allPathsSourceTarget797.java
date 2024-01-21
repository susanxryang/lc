import java.lang.reflect.Array;
import java.util.*;

public class allPathsSourceTarget797 {
  public static void main(String[] args) {
    int n = 3;
    int[][] graph = { { 0, 1 }, { 1, 2 }, { 2, 0 } };
    List<List<Integer>> res = allPathsSourceTarget(graph);
    System.out.print(res);
  }

  public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<Integer>();

    if (graph.length == 0) {
      return res;
    }

    path.add(0);
    dfs(graph, 0, res, path);
    return res;
  }

  public static void dfs(int[][] graph, int node, List<List<Integer>> res, List<Integer> path) {
    if (node == graph.length - 1) {
      res.add(new ArrayList<Integer>(path));
      return;
    }

    for (int neighbor : graph[node]) {
      path.add(neighbor);
      dfs(graph, neighbor, res, path);
      path.remove(path.size() - 1);
    }
  }
}
