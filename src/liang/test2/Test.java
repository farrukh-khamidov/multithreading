package liang.test2;

public class Test implements Runnable {
    public static void main(String[] args) {
        new Test();
    }
    public Test() {
        Test task = new Test();
        new Thread(task).start();
    }
    public void run() {
        System.out.println("test");
    }
}