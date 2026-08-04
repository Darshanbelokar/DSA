import java.util.Stack;

public class DecodeString {
  public static void main(String[] args) {
    String s ="3[a2[b]]";
    System.out.println(decodeString(s));
  }

  public static String decodeString(String s){
    Stack<Integer> countStack = new Stack<>();
    Stack<StringBuilder> stringStack = new Stack<>();

    StringBuilder current  = new StringBuilder();

    int num = 0;

    for(char ch : s.toCharArray()){
      if(Character.isDigit(ch)){
        num = num * 10 + (ch - '0');
      }
      else if(ch == '['){
        countStack.push(num);
        stringStack.push(current);

        current = new StringBuilder();
        num = 0;
      }
      else if(ch == ']'){
        int repeat = countStack.pop();
        StringBuilder prev = stringStack.pop();

        while(repeat-- >0){
          prev.append(current);
        }

        current = prev;

      }
      else{
        current.append(ch);
      }
    }

    return current.toString();
  }
}
