import java.util.Stack;

class MyQueue {
    private Stack<Integer> input = new Stack<>();
    private Stack<Integer> output = new Stack<>();

    // Push element x to the back of queue
    public void push(int x) {
        input.push(x);
    }

    // Removes the element from in front of queue and returns it
    public int pop() {
        peek(); // Ensure output stack has the current front
        return output.pop();
    }

    // Get the front element
    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    // Returns whether the queue is empty
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}
