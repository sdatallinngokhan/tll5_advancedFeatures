package week7.input_output;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadingWritingExample {

    public List<Integer> readFile(String path) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            while (line != null) {
                numbers.add(Integer.parseInt(line));
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return numbers;
    }

    public void writeFile(String path, List<Integer> numbers) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            double average = calculateAverage(numbers);

            printWriter.print("Average of numbers : " + average);

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private double calculateAverage(List<Integer> numbers) {
        double sum = 0;
        int counter = 0;
        for (Integer number : numbers) {
            sum += number;
            counter++;
        }

        return sum / counter;
    }

    public static void main(String[] args) {
        ReadingWritingExample readingWritingExample = new ReadingWritingExample();
        String readingPath = "/Users/gokhanpolat/Developer/tallinn5/numbers.txt";
        String writingPath = "/Users/gokhanpolat/Developer/tallinn5/averageOutput.txt";

        List<Integer> numbers = readingWritingExample.readFile(readingPath);
        readingWritingExample.writeFile(writingPath, numbers);
    }
}
