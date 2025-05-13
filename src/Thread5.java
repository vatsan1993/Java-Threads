
public class Thread5 {
    public static void main(String[] args) {
        UnsafeBuffer buffer = new UnsafeBuffer();

        Thread producer = new Thread(new Producer(buffer));

        Thread consumer = new Thread(new Consumer(buffer));

        producer.start();
        consumer.start();
    }
}
