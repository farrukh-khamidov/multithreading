package liang.ex3;

// Client class
public class Client {

    public static void main(String[] args) {
        // Create a thread
        CustomThread thread1 = new CustomThread();
        // Start a thread
        thread1.start();
        // Create another thread
        CustomThread thread2 = new CustomThread();
        // Start a thread
        thread2.start();
    }
    public void someMethod() {

        // Create a thread
        CustomThread thread1 = new CustomThread();
        // Start a thread
        thread1.start();
        // Create another thread
        CustomThread thread2 = new CustomThread();
        // Start a thread
        thread2.start();
    }
}
