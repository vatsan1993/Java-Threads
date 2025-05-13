import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Integer> {
    private int[] numbers;

    public MyCallable(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int num : numbers) {
            System.out.println("Thread: " + Thread.currentThread().getName());
            System.out.println("Adding: "+num);
            sum += num;
            Thread.sleep(200); // Simulate some delay
        }
        System.out.println("Task completed by: " + Thread.currentThread().getName());
        return sum;
    }
}


