class queue{
    int[] arr = new int[5]; // fixed size 5
    int front = 0, rear = -1, size = 0;

    // Enqueue
    void enqueue(int x) {
        if (size == 5) {
            System.out.println("Queue Overflow!");
            return;
        }
        arr[++rear] = x;
        size++;
        System.out.println(x + " enqueued");
    }

    // Dequeue
    void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow!");
            return;
        }
        System.out.println(arr[front] + " dequeued");
        front++;
        size--;
    }

    // Peek
    void peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element: " + arr[front]);
    }
}

public class Queue{
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.peek();
        q.dequeue();
        q.peek();
    }
}
