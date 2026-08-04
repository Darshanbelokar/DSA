import java.util.Stack;
public class BackSpaceStringCompare {
  public static void main(String[] args) {
   String s = "ab#c";
    String t = "ad#c";
    
    System.out.println(backspaceCompare(s,t));
  }
  public static boolean backspaceCompare(String s,String t){

    Stack<Character> s1  = new Stack<>();
    Stack<Character> s2  = new Stack<>();


    for(Character ch : s.toCharArray()){
      if(ch != '#'){
        s1.push(ch);
      }
      else if(!s1.isEmpty()){
        s1.pop();
      }

    }

    for (char ch : t.toCharArray()) {

    if (ch != '#') {
        s2.push(ch);
    } else if (!s2.isEmpty()) {
        s2.pop();
    }
}

    return s1.equals(s2);
  }
}
