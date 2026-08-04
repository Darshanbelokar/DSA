import java.util.Stack;

public class Valid_paranthesis_stack {
    public static void main(String[] args) {
      
      String s = "[({})]";

      System.out.println(isvalid(s));
      
    }

    public static boolean isvalid(String S){

    Stack<Character> stack = new Stack<>();
    
    for(char c : S.toCharArray()){
      
      if(c=='(' || c=='{' || c==']'){
        stack.push(c);
      }

      else{
        if(stack.isEmpty()){
          return false;
        }

        char top = stack.pop();

        if((c == ')' && top != '(') || 
          (c == ']' && top != '[') ||
          (c == '}' && top !='}')){
            return false;
          }
      }
    }
      return stack.isEmpty();
    }
}
