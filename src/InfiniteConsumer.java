public class InfiniteConsumer implements Runnable {
    private SafeBuffer buffer;

    public InfiniteConsumer(SafeBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.consume();
                Thread.sleep(700);  // Simulate time taken to consume an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}