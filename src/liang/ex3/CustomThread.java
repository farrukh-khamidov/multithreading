package liang.ex3;

// Custom thread class
public class CustomThread extends Thread {
    // Override the run method in Runnable
    @Override
    public void run() {
        // Tell system how to perform this task
        System.out.println("test");
    }
}
