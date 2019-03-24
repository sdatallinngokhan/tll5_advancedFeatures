package week7.exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriterFromConsole {

    public void takeInputAndPutToFile(String path) {
        try {
            Scanner scanner = new Scanner(System.in);
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            while (true) {
                System.out.print("Type a sentence. nl for new line. EoF for termination : ");
                String input = scanner.nextLine();

                if (input.equals("EoF")) {
                    break;
                } else if(input.equals("nl")) {
                    printWriter.println();
                } else {
                    printWriter.print(input);
                }
            }

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileWriterFromConsole fileWriterFromConsole = new FileWriterFromConsole();

        String path = "/Users/gokhanpolat/Developer/tallinn5/consoleToFile.txt";
        fileWriterFromConsole.takeInputAndPutToFile(path);
    }
}
