public class Thread6 {
    public static void main(String[] args) {
        SafeBuffer buffer = new SafeBuffer(10);

        Thread producer = new Thread(new InfiniteProducer(buffer));

        Thread consumer = new Thread(new InfiniteConsumer(buffer));

        producer.start();
        consumer.start();
    }
}
