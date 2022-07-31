package liang.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskThreadDemo {
    public static void main(String[] args) {
        // Create a fixed thread pool with maximum three threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Start threads
        executor.execute(new PrintChar('a', 10000));
        executor.execute(new PrintChar('b', 10000));
        executor.execute(new PrintNum(10000));

        // Shut down the executor
        executor.shutdown();
    }
}
