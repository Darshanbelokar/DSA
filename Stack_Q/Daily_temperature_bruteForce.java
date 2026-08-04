public class Daily_temperature_bruteForce {
  public static void main(String[] args) {
    int[] temperatures = {30,60,90};
    int [] ans = dailyTemperatures(temperatures);

    for(int temperature : ans){
      System.out.println(temperature);
    }
  }
  public static int[] dailyTemperatures(int[] temperatures){

    int n = temperatures.length;
    int [] ans = new int[n];
    int count = 0;
    for(int i = 0;i < n ; i++){
      for(int j = i+1; j<n ; j++){
        if(temperatures[j] > temperatures[i]){
          ans[i] = j-i;
          break; 
        }
        else {
          ans[i] = 0;
        }
      }
    }

    return ans;
  }
}
