import java.util.concurrent.*;

public class Thread4 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2 = {10, 20, 30, 40, 50};
        // Create a callable task
        MyCallable th1 = new MyCallable(numbers);
        MyCallable th2 = new MyCallable(numbers2);
        FutureTask<Integer> task1 = new FutureTask<>(th1);
        FutureTask<Integer> task2 = new FutureTask<>(th2);


        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        try {
            t1.start();
            t2.start();
            Integer result = task1.get();
            Integer result2 = task2.get();
            System.out.println(result);
            System.out.println(result2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
