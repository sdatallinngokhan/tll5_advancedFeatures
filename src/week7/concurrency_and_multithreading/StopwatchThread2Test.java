package week7.concurrency_and_multithreading;

public class StopwatchThread2Test {

    public static void main(String[] args) {
        StopWatchThread2 stopWatchThread2_1 = new StopWatchThread2("SW1");
        StopWatchThread2 stopWatchThread2_2 = new StopWatchThread2("SW2");

        stopWatchThread2_1.start();
        stopWatchThread2_2.start();
    }
}
