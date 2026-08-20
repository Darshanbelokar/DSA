public class H100mRace {
  public static void main(String[] args) {
    double[] players = {
          11, 13, 12, 9, 10, 9.5, 10.2, 10.8
    };

    System.out.println(findMinimum(players));
  }

  public static double findMinimum(double [] players){
    int left = 0;
    int right = 2;

    double total = 0;

    while(right < players.length){
      double min = players[left];
      
      for(int i = left; i <= right ;i++){
        min = Math.min(min,players[i]);
      }

      total += min;

      left++;
      right++;
    }
    return total;
  }
}
