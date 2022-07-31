package liang.ex4;

class PrintNum implements Runnable {
    private int lastNum;

    /**
     * Construct a task for printing 1, 2, ..., n
     */
    public PrintNum(int n) {
        lastNum = n;
    }

    @Override
    /** Tell the thread how to run */
    public void run() {
        Thread thread4 = new Thread(new PrintChar('c', 40));
        thread4.start();
        try {
            for (int i = 1; i <= lastNum; i++) {
                System.out.print (" " + i);
                if (i == 50) thread4.join();
            }
        }
        catch (InterruptedException ex) {
        }
    }
}
