import java.util.Stack;
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int value = stack.pop();
        if (value == minStack.peek()) {
            minStack.pop();
        }
        return value;
    }

    public int min() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }
}
