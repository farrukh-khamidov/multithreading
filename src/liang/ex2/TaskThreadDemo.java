package liang.ex2;

public class TaskThreadDemo {
    public static void main(String[] args) {
        // Create tasks
        Runnable printA = new PrintChar('a', 10000);
//        Runnable printB = new PrintChar('b', 1000);
        Runnable print100 = new PrintNum(10000);

        // Create threads
        Thread thread1 = new Thread(printA);
//        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        // Start threads
        thread1.start();
//        thread2.start();
        thread3.start();

    }
}
