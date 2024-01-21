public class MinCostClimbingStairs{
  public static void main(String[] args){
    int[] cost = {0,0,0,0};
    System.out.println(minCostClimbingStairs(cost));
  }
  public static int minCostClimbingStairs(int[] cost){
    int total0 = getCost(0, cost);
    int total1 = getCost(1, cost);
    return Math.min(total0, total1);
  }

  public static int getCost(int i, int[] cost){
    if(i+2 < cost.length){
      int total = cost[i] + Math.min(getCost(i+1, cost), getCost(i+2, cost));
      return total;
    } else if(i + 2 == cost.length){
      return cost[i];
    } else if (i + 1 == cost.length){ 
      return cost[i];
    } else {
      return 0;
    }
  }
}