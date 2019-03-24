package week7.new_input_output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NewIOReadingExample {

    public void readFile(String pathString) {
        try {
            Path path = Paths.get(pathString);
            List<String> readLines = Files.readAllLines(path);

            for (String line : readLines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NewIOReadingExample newIOReadingExample = new NewIOReadingExample();

        String absolutePath = "/Users/gokhanpolat/Developer/tallinn5/testReaderFile.txt";
        String relativePath = "testReaderFile.txt"; // relative path can be used if the file is under the project
        newIOReadingExample.readFile(relativePath);
    }

}
