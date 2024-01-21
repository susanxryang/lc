import java.util.*;

class BestTimeToBuyAndSellStock {
  public static void main(String[] args) {
    int[] prices = {7,6,4,1};
    
    System.out.print(maxProfit(prices));
  }

  public static int maxProfit(int[] prices) {
    int max_profit = 0;
    int min_price = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++){
      min_price = Math.min(prices[i], min_price);
      max_profit = Math.max(prices[i] - min_price, max_profit);
    }
    return max_profit;
  }
}