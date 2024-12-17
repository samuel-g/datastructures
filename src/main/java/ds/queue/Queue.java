package ds.queue;
public class Queue {

    private int[] arr;
    private int maxSize, front, rear, nItems;

    public Queue (int size) {
        this.maxSize = size;
        this.arr = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int e) {
        if(rear == maxSize - 1) {
            rear = (rear + 1) % maxSize;
        }
        arr[++rear] = e;
        nItems++;
    }

    int dequeue() {
        int result = arr[front];
        front++;
        nItems--;
        return result;
    }

    int peek() {
        return arr[front];
    }

    boolean isEmpty() {
        return nItems == 0;
    }

    int size() {
        return nItems;
    }

    void printQueue() {
        for(int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main (String [] args) {
        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
        System.out.println("print queue-");
        queue.printQueue();
        System.out.println();
        System.out.println("after dequeue-");
        queue.dequeue();
        queue.printQueue();
    }
}
