

public class Stack {
    
    int top;        // keeps track of top index
    int capacity;   // maximum size of stack
    int arr[];      // array to hold elements

    // Constructor
    Stack(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1; // initially stack is empty
    }

    // Push operation
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + data);
            return;
        }
        arr[++top] = data; // increment top and insert data
        System.out.println(data + " pushed to stack");
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        int popped = arr[top--]; // return top element and decrease top
        return popped;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        Stack stack1 = new Stack(5);

        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.display();

        System.out.println("Top element is: " + stack1.peek());

        System.out.println("Popped element: " + stack1.pop());
        stack1.display();
    }
}
