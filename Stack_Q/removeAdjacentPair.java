import java.util.Stack;
public class removeAdjacentPair {
  public static void main(String[] args) {
      String s = "abbaca";
      System.out.println(removeduplicates(s));
  }
  public static String removeduplicates(String s){
    Stack<Character> stack  = new Stack<>();

    for(Character ch : s.toCharArray()){
      if(!stack.isEmpty() && stack.peek() == ch){
        stack.pop();
      }
      else{
        stack.push(ch);
      }
    }

    StringBuilder ans = new StringBuilder();
    while(!stack.isEmpty()){
      ans.append(stack.pop());
    }

    return ans.reverse().toString();
  }
}
