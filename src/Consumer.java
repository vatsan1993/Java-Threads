public class Consumer implements Runnable {
    UnsafeBuffer buffer;
    public Consumer (UnsafeBuffer buffer){
        this.buffer = buffer;

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            buffer.consume();
        }
    }
}
