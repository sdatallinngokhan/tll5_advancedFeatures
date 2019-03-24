package week7.concurrency_and_multithreading;

public class StopWatchThread2 extends Thread { // same as implements Runnable

    private String prefix;

    public StopWatchThread2(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(prefix + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
