import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveKDigits {
  public static void main(String[] args) {
    String s = "1432219";
    int k = 3;
    System.out.println(removeKDigits(s, k));
  }

  public static String removeKDigits(String num , int k){
    Deque<Character> stack = new ArrayDeque<>();

    for(int i = 0;i<=num.length()-1;i++ ){
      while (!stack.isEmpty() && k>0 && stack.peek() > num.charAt(i)){
          stack.pop();
          k = k-1;
        }
          stack.push(num.charAt(i));
      }
    while(k > 0){
      stack.pop();
      k--;
    }

    StringBuilder sb = new StringBuilder();

    while(!stack.isEmpty()){
      sb.append(stack.pop());
    }

    sb.reverse();

    while (sb.length() > 0 && sb.charAt(0) == '0') {
      sb.deleteCharAt(0);
    }

    if (sb.length() == 0) {
      return "0";
    }

    return sb.toString();

  }

}