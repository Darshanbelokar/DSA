public class Best_time_to_buy_and_sell_stocks {
  public static void main (String[] args){
    int[] prices1 = {1,4,4,9};
    System.out.println(maxProfit(prices1));
  }

  public static int maxProfit(int[] prices){
    int res=0;

    for(int i=0;i<prices.length;i++){
      int buy = prices[i];
      for(int j=i+1;j<prices.length;j++){
        int sell = prices[j];
        res = Math.max(res,sell - buy);
      }
    }
    return res;
  }
}
