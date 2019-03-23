package week7.exercises;

public class MiddleElementFinder {

    public static void main(String[] args) {
        MiddleElementFinder middleElementFinder = new MiddleElementFinder();
        int[] arr = {2, 16, 15, 4, 12, 65, 3, 7};

        middleElementFinder.findMiddle(arr);
    }

    private void findMiddle(int[] arr) {

        int[] sortedArr = sortArray(arr);

        if (sortedArr.length % 2 == 1) {
            System.out.println("Middle element : " + sortedArr[sortedArr.length / 2]);
        } else {
            System.out.println("Middle elements : " + sortedArr[sortedArr.length / 2 - 1] + " , "+sortedArr[sortedArr.length / 2]);
        }
    }

    private int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
