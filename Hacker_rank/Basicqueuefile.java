import java.util.LinkedList;
import java.util.Queue;

public class BasicQueue {
    public static void main(String[] args) {
        // Use LinkedList as it implements the Queue interface
        Queue<Integer> queue = new LinkedList<>();

        // 1. Enqueue (add elements)
        queue.add(10);
        queue.offer(20); // offer() is preferred as it returns false instead of throwing exception if full

        // 2. Peek (view the front element without removing)
        System.out.println("Front element: " + queue.peek()); // Output: 10

        // 3. Dequeue (remove and return the front element)
        int removed = queue.poll(); 
        System.out.println("Removed: " + removed); // Output: 10

        // 4. Check status
        System.out.println("Current Queue: " + queue);
        System.out.println("Is Empty? " + queue.isEmpty());
    }
}

