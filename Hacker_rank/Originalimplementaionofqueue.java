class CustomQueue {
    private int[] arr;
    private int front, rear, size, capacity;

    public CustomQueue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Add element to the end of the queue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow!");
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        arr[rear] = data;
        size++;
    }

    // Remove element from the front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        int data = arr[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return data;
    }

    public int peek() {
        return isEmpty() ? -1 : arr[front];
    }

    public boolean isEmpty() { return size == 0; }
    public boolean isFull() { return size == capacity; }
}

