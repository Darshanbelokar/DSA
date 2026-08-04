import java.util.Deque;
import java.util.ArrayDeque;

public class EvaluateReversePolishNotation {
  public static void main(String[] args) {
    String [] tokens = {"2","1","+","3","*"};
    System.out.println(evalRPN(tokens));
  }

  public static int evalRPN(String[] tokens){
    Deque<Integer> stack  = new ArrayDeque<>();

    for(String token : tokens){
      switch(token){
        case "+" :
          stack.push(stack.pop() + stack.pop());
          break;

        case "-":
          int b = stack.pop();
          int a = stack.pop();
          stack.push(a-b);
          break;

        case "*":
          stack.push(stack.pop() * stack.pop());
          break;

        case "/":
           b = stack.pop();
           a = stack.pop();
           stack.push(a/b);
           break;

        default : 
         stack.push(Integer.parseInt(token));
      }
    }
    return stack.pop();
  }
}
