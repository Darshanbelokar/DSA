public class Best_time_to_buy_and_sell_stocks_optimal{
  public static void main(String[] args){
    int[] prices1 = {2,1,4,2,8,5,10};
    System.out.println(maxProfit(prices1));
  }
  public static int maxProfit(int[] prices){
    int left = 0;
    int right = 1;
    
    int maxprofit = 0;
    while(right < prices.length){
      if(prices[right] > prices[left]){
        int profit = prices[right] - prices[left];
        maxprofit = Math.max(maxprofit, profit);
      }
      else{
        left = right;
      }
      right ++;
    }
    return maxprofit;
  } 
}