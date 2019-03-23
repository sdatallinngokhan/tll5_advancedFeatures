package week7.input_output;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingExample {

    public void readFile(String path) {
        try {
            File file = new File(path); // create or take File from the path
            FileReader fileReader = new FileReader(file); // bind File to FileReader
            BufferedReader bufferedReader = new BufferedReader(fileReader); // bind FileReader to BufferedReader to buffer(keep) file lines

            String line = bufferedReader.readLine(); // read first line

            while (line != null) { // continue to read file until getting null line(until lines are consumed)
                System.out.println(line);
                line = bufferedReader.readLine(); // get next line in each iteration
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadingExample readingExample = new ReadingExample();

        String path = "/Users/gokhanpolat/Developer/tallinn5/testReadingFile.txt";
        readingExample.readFile(path);
    }
}
