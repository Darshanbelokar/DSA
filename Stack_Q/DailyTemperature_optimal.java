import java.util.Stack;

public class DailyTemperature_optimal {
  public static void main(String[] args) {
    int[] temperatures = {30,60,90};
    int[] ans = dailyTemperature(temperatures);

    for(int x : ans){
      System.out.println(x);
    }
  }

  public static int[] dailyTemperature(int[] temperatures){
    int n = temperatures.length;
    int[] answer = new int[n];

    Stack<Integer> stack = new Stack<>();
    for(int j = n - 1; j >= 0; j--){
      while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[j]){
        stack.pop();
      }
      if(!stack.isEmpty()){
        answer[j] = stack.peek() - j;
      }
      stack.push(j);
    }
    return answer;
  }
}

