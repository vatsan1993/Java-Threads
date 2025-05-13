public class Thread7 {
    public static void main(String[] args) {
        Resource r1 = new Resource("Resource 1");
        Resource r2 = new Resource("Resource 2");

        Thread t1 = new Thread(new DeadLockTask(r1, r2), "Thread 1");
        Thread t2 = new Thread(new DeadLockTask(r2, r1), "Thread 2");

        t1.start();
        t2.start();
    }
}
