import java.util.Stack;

public class valid_paranthesis {
  public static void main(String[] args) {
    String s = "()";
    System.out.println(isValid(s));
  }

  public static boolean isValid(String s){
     Stack<Character> mystack = new Stack<>();
     
     for(char ch : s.toCharArray()){
      if(ch == '(' || ch == '{' || ch == '['){
        mystack.push(ch);
      }
      else{
        if(mystack.isEmpty()){
          return false;
        }
        char top = mystack.pop();
        
        if(ch == ')' && top != '(' ) return false;
        if(ch == '}' && top != '{' ) return false;
        if(ch == ']' && top != '[' ) return false;
      }
     }

     return mystack.isEmpty();
  }
}
