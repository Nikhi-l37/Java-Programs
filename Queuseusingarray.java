class SimpleQueue {
    private int[] arr;
    private int front, rear, size, capacity;

    public SimpleQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        arr[rear] = item;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return item;
    }

    public int peek() {
        return (size == 0) ? -1 : arr[front];
    }
}

