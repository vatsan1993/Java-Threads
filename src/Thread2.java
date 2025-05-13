public class Thread2 {
    public static void main(String[] args) {
        // Creating instances of MyThread
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Setting thread names (optional)
        t1.setName("Thread-1");
        t2.setName("Thread-2");

        // Starting the threads
        t1.start(); // Calls run() method of MyThread
        t2.start();
    }
}
