import java.util.LinkedList;
import java.util.Queue;

class UnsafeBuffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity = 2;

    public void produce(int value) {
        if (queue.size() < capacity) {
            queue.add(value);
            System.out.println("Produced: " + value);
        } else {
            System.out.println("Buffer is full! Producer cannot add: " + value);
        }
    }

    public void consume() {
        if (!queue.isEmpty()) {
            int value = queue.poll();
            System.out.println("Consumed: " + value);
        } else {
            System.out.println("Buffer is empty! Consumer cannot consume.");
        }
    }
}
