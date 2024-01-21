public class UniquePaths{
  public static void main(String[] agrs){
    // int[] arr = new int{3,1,2,4};
  }

  public static int uniquePaths(int m, int n){
    // each grid has path number = path number of box above + box to the left
    // init all top and left to 1
    int[][] matrix = new int[m][n];
    for(int i = 0; i < m; i++){
      matrix[i][0] = 1;
    }
    for(int i = 0; i < n; i++){
      matrix[0][n] = 1;
    }

    for(int row = 1; row < m; row++){
      for(int col = 1; col < n; col++){
        matrix[row][col] = matrix[row-1][col] + matrix[row][col-1];
      }
    }

    return matrix[m-1][n-1];
  }
}