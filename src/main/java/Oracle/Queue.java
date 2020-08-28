package Oracle;

/**
 * Created by prasun.pallav on 12/26/2018.
 */
public class Queue {
    private static final int MAX = 1000;
    private int size = -1;
    private int front;
    private int a[] = new int[MAX]; // Maximum size of Queue

    public Queue() {
        front = 0;
    }

    private void enqueue(int x) {
        a[++size] = x;
        System.out.println(x + " enqueued to queue");
    }

    private int dequeue() {
        int item = a[front];
        front = front + 1;
        return item;
    }

    private void display() {
        System.out.print("Updated Array...");
        for (int i = size; i >= front; i--) {
            System.out.print(a[i]+",");
        }
    }

    public static void main(String args[]) {
        Queue s = new Queue();
        s.enqueue(10);
        s.enqueue(20);
        s.enqueue(30);
        s.enqueue(40);
        System.out.println(s.dequeue() + " Dequeued from Queue");
        s.display();
    }
}
