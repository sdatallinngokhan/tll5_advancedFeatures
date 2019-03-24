package week7.concurrency_and_multithreading;

public class StopWatchThreadTest {

    public static void main(String[] args) throws InterruptedException { // when main method is created, main thread is created too
        StopWatchThread stopWatchThread = new StopWatchThread();
        stopWatchThread.setDaemon(false); // if setDaemon is set true, the sub thread end right after main thread ends

        stopWatchThread.start();
        System.out.println("Main thread starts");

        Thread.sleep(5000);
        System.out.println("Main thread is still running");

        Thread.sleep(5000);
        System.out.println("Main thread ends");
    }
}
