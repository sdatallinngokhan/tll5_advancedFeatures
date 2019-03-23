package week7.input_output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingExample {

    public void writeFile(String path) {
        try {
            File file = new File(path); // create or take File from the path
            FileWriter fileWriter = new FileWriter(file); // bind File to FileWriter
            PrintWriter printWriter = new PrintWriter(fileWriter); // bind FileWriter to PrintWriter to print data

            printWriter.print("Gokhan"); // print data in same line
            printWriter.print(" ");
            printWriter.println("Polat"); // print data and go next line
            printWriter.print("24336455624312");

            printWriter.close(); // to save data into file printWriter needs to be closed
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WritingExample writingExample = new WritingExample();

        String path = "/Users/gokhanpolat/Developer/tallinn5/testWritingFile.txt"; // if testWritingFile is not exist, FileWriter will create automatically
        writingExample.writeFile(path);
    }

}
