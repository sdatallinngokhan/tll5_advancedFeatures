package week7.new_input_output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class NewIOWritingExample {

    public void writeFile(String pathString) {
        try {
            Path path = Paths.get(pathString);

//            List<String> linesToWrite = new ArrayList<>();
//            linesToWrite.add("Gokhan");
//            linesToWrite.add("Polat");
            List<String> linesToWrite = Arrays.asList("\n", "Gokhan", "Polat"); // doing same thing with above 3 lines

            Files.write(path, linesToWrite, StandardOpenOption.CREATE); // 3rd parameter is used to append the file instead of overriding

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NewIOWritingExample newIOWritingExample = new NewIOWritingExample();

        String path = "/Users/gokhanpolat/Developer/tallinn5/testReaderFile.txt";
        newIOWritingExample.writeFile(path);
    }
}
