public class Resere_of_string_using_stack {

    int top;
    int cap;
    char arr[];

    Resere_of_string_using_stack(int size){
            cap = size;
            arr = new char[cap];
            top = -1;
    }

     public void push(char data) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + data);
            return;
        }
        arr[++top] = data; // increment top and insert data
        System.out.println(data + " pushed to stack");
    }


      public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        char popped = arr[top--]; // return top element and decrease top
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }


       public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == cap - 1;
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

    public void reverse() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("reverse of a string ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



 public static void main(String[] args) {
        Resere_of_string_using_stack stack = new Resere_of_string_using_stack(5);

        stack.push('N');
        stack.push('I');
        stack.push('K');
        stack.display();

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        stack.display();
        stack.reverse();
    }
}
    
