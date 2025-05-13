public class Producer implements Runnable{
    UnsafeBuffer buffer;
    public Producer (UnsafeBuffer buffer){
        this.buffer = buffer;

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            buffer.produce(i);
        }
    }
}
