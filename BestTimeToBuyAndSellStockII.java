import java.util.*;

class BestTimeToBuyAndSellStockII {
  public static void main(String[] args) {
    int[] prices = {1,2,3,4,5};
    
    System.out.print(maxProfit(prices));
  }

  public static int maxProfit(int[] prices) {
    int max_profit = 0;
    // int min_price = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length - 1; i++){
      if(prices[i+1] - prices[i] > 0){
        max_profit += prices[i+1] - prices[i];
      }    
    }
    return max_profit;
  }
}