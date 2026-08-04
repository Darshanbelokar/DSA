public class stackUsingArray{
    public static void main(String[] args) {
        
        Stack myStack = new Stack(5);
        myStack.push(10);
        myStack.push(20);
        System.out.println("Top element: " + myStack.peek()); 
        System.out.println("Popped: " + myStack.pop());       
    }
}

class Stack {
    private int[] arr;
    private int top;
    private int capacity;

   
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public int push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return -1;
        }
        arr[++top] = x;
        return x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        return -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}