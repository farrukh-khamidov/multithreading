public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    System.out.print(i);
                }
            }
        });
        thread.start();

        for (int i = 0; i < 100000; i++) {
            System.out.print('a');
        }
        thread.join();
        System.out.println();
        System.out.println(System.currentTimeMillis() - startTime);
    }
}