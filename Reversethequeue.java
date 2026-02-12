import java.util.*;

public class Main {
    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        // 1. Move everything from Queue to Stack
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        // 2. Move everything from Stack back to Queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        
        System.out.println("Original: " + q);
        reverseQueue(q);
        System.out.println("Reversed: " + q);
    }
}
