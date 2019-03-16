package week6.exercises;

import java.util.Collections;

public class SecondBiggestFinder {

    public int[] sortAnArrayFromBiggestToSmallest(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {12, 54, 2, 4, 37, 94, 33};

        SecondBiggestFinder secondBiggestFinder = new SecondBiggestFinder();
        int[] sortedArray = secondBiggestFinder.sortAnArrayFromBiggestToSmallest(arr);

        System.out.println("Result : " + sortedArray[1]);
    }

}
