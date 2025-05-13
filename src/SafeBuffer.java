import java.util.LinkedList;
import java.util.Queue;

public class SafeBuffer {
    private Queue<Integer> queue;
    private int capacity;

    public SafeBuffer(int capacity) {
        this.queue = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            System.out.println(Thread.currentThread().getName() + " waiting - Buffer is full");
            wait();
        }

        queue.add(value);
        System.out.println("Produced: " + value);
        notify();  // Notify the consumer that a new item is available
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println(Thread.currentThread().getName() + " waiting - Buffer is empty");
            wait();
        }

        int value = queue.poll();
        System.out.println("Consumed: " + value);
        notify();  // Notify the producer that space is available
    }
}
