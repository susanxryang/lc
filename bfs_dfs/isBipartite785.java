public class isBipartite785 {
  public void main(String[] args) {
    int[][] graph = new int[][] {{1,2,3},{0,2},{0,1,3},{0,2}}
    isBipartite(graph);
    System.out.println(graph);
  }

  public boolean isBipartite(int[][] graph) {
    int[] colors = new int[graph.length];
    for (int i = 0; i < graph.length; i++){
      if (colors[i] == 0 && !validColor(graph, colors, 1, i)){
        return false;
      }
    }
    return true;
  }

  boolean validColor(int[][] graph, int[] colors, int color, int i) {
    if (colors[i] != 0){
      return colors[i] == color;
    }
    colors[i] = color;       
    for (int neighbor : graph[i]){
      if (!validColor(graph, colors, -color, neighbor)){
        return false;
      }
    }
    return true;
  }
}
