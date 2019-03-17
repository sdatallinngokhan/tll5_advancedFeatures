package week6.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FinallyBlockExample {

    public void useFinallyBlock() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {5, 1, 54, 0};
        int sum = arr[2] + arr[3]; // you don't need to put this line into try block. because summing operation never throws exception
        try {
            int a = arr[1] / arr[3]; // dividing might throw exception, so it is better to put this line into try block
            int b = scanner.nextInt();
            System.out.println("try block is finished successfully");
        } catch (Exception e) {
            System.out.println("try block is not working properly");
            e.printStackTrace();
        } finally { // finally block works always
            System.out.println("Always do something here");
            scanner.close(); // scanner will be closed always because closing happens in finally block
        }
    }

    public void useMultipleCatchBlock() {
        try {
            int a = 5 / 0;

            File file = new File("wrong path");
            FileReader fileReader = new FileReader(file);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void useCombinedCatchBlock() {
        try {
            int a = 5 / 0;

            File file = new File("wrong path");
            FileReader fileReader = new FileReader(file);
        } catch (ArithmeticException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinallyBlockExample finallyBlockExample = new FinallyBlockExample();

        finallyBlockExample.useFinallyBlock();
    }

}
