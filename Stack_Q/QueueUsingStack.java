import java.util.Stack;

public class QueueUsingStack {

    public static void main(String[] args) {

        Queue q = new Queue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println(q.pop());   
        System.out.println(q.pop());   
        System.out.println(q.pop());  
    }
}

class Queue {

    Stack<Integer> input;
    Stack<Integer> output;

    public Queue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {

        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        return output.pop();
    }

    public int peek() {

        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}