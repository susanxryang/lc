import java.util.*;

// 1971. Find if Path Exists in Graph

public class ValidPath1971 {
  public void main(String[] args) {
    int n = 3;
    int[][] edges = { { 0, 1 }, { 1, 2 }, { 2, 0 } };
    int source = 0;
    int dest = 2;
    boolean res = validPath(n, edges, source, dest);
    System.out.print(res);
  }

  public boolean validPath(int n, int[][] edges, int source, int destination) {

    // form graph
    boolean[] visited = new boolean[n];
    Map<Integer, List<Integer>> graph = new HashMap();
    for (int i = 0; i < n; i++)
      graph.put(i, new ArrayList());
    for (int[] edge : edges) {
      graph.get(edge[0]).add(edge[1]);
      graph.get(edge[1]).add(edge[0]);
    }
    // found = false;
    found = dfs(graph, visited, source, destination);
    
    return found;
  }

  private boolean found;

  public boolean dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int source, int destination) {
    if (source == destination) {
      return true;
    }
    if (visited[source]) {
      return false;
    }
    visited[source] = true;
    for (int neighbor : graph.get(source)) {
      if (dfs(graph, visited, neighbor, destination)) {
        return true;
      }
    }
    return false;
    // if (visited[source] || found) { // if we already visited the source node
    // return;
    // }
    // visited[source] = true;
    // for (int neighbor : graph.get(source)) {
    // if (neighbor == destination) {
    // found = true;
    // break;
    // }
    // if (!visited[neighbor]) {
    // dfs(graph, visited, neighbor, destination);
    // }
    // }
  }
}
