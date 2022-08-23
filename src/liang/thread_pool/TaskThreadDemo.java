package liang.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskThreadDemo {
    public static void main(String[] args) {
        // Create a fixed thread pool with maximum three threads
        ExecutorService executor = Executors.newCachedThreadPool();

        // Start threads
        executor.execute(new PrintChar('a', 3));
        executor.execute(new PrintChar('b', 10000));
        executor.execute(new PrintNum(10000));
        executor.execute(new PrintChar('c', 10000));
        executor.execute(new PrintChar('d', 10000));

        // Shut down the executor
        executor.shutdown();
    }
}
