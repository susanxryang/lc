public class ClimbingStairs{
  public static void main(String[] args){
    int n = 3;
    System.out.println(climbStairs(n));
  }

  public static int climbStairs(int n){
    int twoBefore = 1;
    int oneBefore = 2;
    if(n == 1) return 1;
    int curr = oneBefore;
    for(int i = 3; i <= n; i++){
      curr = oneBefore + twoBefore;
      twoBefore = oneBefore;
      oneBefore = curr;
    }
    return curr;
  }
}