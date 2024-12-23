package ds.queue;

public class MyQueue {

    private int[] arr;
    private final int maxSize;
    private int front;
    private int rear;
    private int nItems;

    public MyQueue(int size) {
        this.maxSize = size;
        this.arr = new int[size];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    void enqueue(int e) {
        if (nItems == maxSize) {
            throw new IllegalStateException("Queue is full!");
        }
        rear = (rear + 1) % maxSize; // Wrap around rear
        arr[rear] = e;
        nItems++;
    }

    int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        int result = arr[front];
        front = (front + 1) % maxSize; // Wrap around front
        nItems--;
        return result;
    }

    int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        return arr[front];
    }

    boolean isEmpty() {
        return nItems == 0;
    }

    boolean isFull() {
        return nItems == maxSize;
    }

    int size() {
        return nItems;
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < nItems; i++) {
            System.out.print(arr[(front + i) % maxSize] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);

        System.out.println("Initial queue:");
        queue.printQueue();

        System.out.println("After dequeue:");
        queue.dequeue();
        queue.printQueue();

        System.out.println("Peek: " + queue.peek());

        queue.enqueue(7);
        System.out.println("After enqueue (7):");
        queue.printQueue();
    }
}
