import java.util.Stack;

public class minStack{

  Stack<Integer> stack;
  Stack<Integer> minStack;
 
  public minStack(){    
    stack = new Stack<>();
    minStack =new Stack<>();
  } 

  public void push(int value){
    stack.push(value);
    if(minStack.isEmpty() || value <= minStack.peek()){
      minStack.push(value); 
    }
  }

  public void pop(){
    if(stack.isEmpty()) 
      return;
    int top = stack.pop();
    if(top == minStack.peek()){
      minStack.pop();
    }
  }

  public int top(){
    return stack.peek();
  }
  
  public int getMin(){
    return minStack.peek();
  }
}