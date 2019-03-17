package week6.exercises;

public class FibonacciFinder {

    public int getNthFibo(int n) {
        int fibo1 = 1;
        int fibo2 = 1;
        int fibo3 = 2;

        if (n == 1 || n == 2) {
            return fibo1;
        }
        if (n == 3) {
            return fibo3;
        }

        int counter = 4;
        while (true) {
            fibo1 = fibo2 + fibo3;
            if (counter == n) {
                return fibo1;
            }
            counter++;

            fibo2 = fibo1 + fibo3;
            if (counter == n) {
                return fibo2;
            }
            counter++;

            fibo3 = fibo1 + fibo2;
            if (counter == n) {
                return fibo3;
            }
            counter++;
        }
    }

    public static void main(String[] args) {
        FibonacciFinder fibonacciFinder = new FibonacciFinder();

        int nth = 78;
        System.out.println(fibonacciFinder.getNthFibo(nth));
    }
}
