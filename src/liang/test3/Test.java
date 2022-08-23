package liang.test3;

public class Test implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        new Test();
    }
    public Test() throws InterruptedException {
        Thread t = new Thread(this);
        t.start();
        Thread.sleep(5000);
        t.start();
    }
    public void run() {
        System.out.println("test");
    }
}
