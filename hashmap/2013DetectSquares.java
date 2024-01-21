import java.util.ArrayList;

public class DetectSquares2013 {
  int[][] countPoints = new int[100][100];
  ArrayList<int[]> points = new ArrayList<>();

  // public DetectSquares() { 
    
  // }

  public void add(int[] p) {
    countPoints[p[0]][p[1]] += 1;
    points.add(p);

  }

  public int count(int[] p1) {
    int x1 = p1[0], y1 = p1[1], ans = 0;
    for (int[] p3 : points) {
      int x3 = p3[0], y3 = p3[1];
      if (Math.abs(x1 - x3) == 0 || Math.abs(x1 - x3) != Math.abs(y1 - y3))
        continue; // Skip empty square or invalid square point!
      ans += countPoints[x1][y3] * countPoints[x3][y1];
    }
    return ans;
  }

}
