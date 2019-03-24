package week7.new_input_output;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewIOReadingWritingExample {

    public List<String> readFile(String readingPath) {
        List<String> lines = new ArrayList<>();
        try {
            Path path = Paths.get(readingPath);

            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    public void writeFile(String writingPath, List<String> lines) {
        try {
            Path path = Paths.get(writingPath);

            Double average = calculateAverage(lines);

            Files.write(path, Arrays.asList(average.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private double calculateAverage(List<String> lines) {
        int sum = 0;
        int counter = 0;

        for (String line : lines) {
            sum += Integer.parseInt(line);
            counter++;
        }
        return sum / counter;
    }


    public static void main(String[] args) {
        NewIOReadingWritingExample newIOReadingWritingExample = new NewIOReadingWritingExample();

        String readingPath = "/Users/gokhanpolat/Developer/tallinn5/numbers.txt";
        String writingPath = "/Users/gokhanpolat/Developer/tallinn5/averageOutput.txt";

        List<String> lines = newIOReadingWritingExample.readFile(readingPath);

        newIOReadingWritingExample.writeFile(writingPath, lines);
    }

}
