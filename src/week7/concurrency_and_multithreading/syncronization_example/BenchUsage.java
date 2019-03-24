package week7.concurrency_and_multithreading.syncronization_example;

public class BenchUsage {

    public static void main(String[] args) {
        Bench bench = new Bench(1);
        SeatTakerThread seatTakerThread1 = new SeatTakerThread(bench);
        SeatTakerThread seatTakerThread2 = new SeatTakerThread(bench);

        seatTakerThread1.start();
        seatTakerThread2.start();
    }
}
