package week7.exercises;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class WordSwitcher {

    public List<String> readFile(String path) {
        List<String> lines = new LinkedList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {
                lines.add(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    public void writeFile(String path, List<String> lines) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            List<String> switchedLines = switchLines(lines);

            for (String switchedLine : switchedLines) {
                printWriter.println(switchedLine);
            }

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> switchLines(List<String> lines) {
        List<String> switchedLines = new LinkedList<>();

        for (String line : lines) {
            String[] lineArray = line.split(" ");

            String switchedLine = "";
            if (lineArray.length % 2 == 0) {
                for (int i = 0; i < lineArray.length; i = i + 2) {
                    switchedLine += lineArray[i + 1] + " " + lineArray[i] + " ";
                }
            } else {
                switchedLine += lineArray[lineArray.length - 1] + " ";
                for (int i = 0; i < lineArray.length - 1; i = i + 2) {
                    switchedLine += lineArray[i + 1] + " " + lineArray[i] + " ";
                }
            }

            switchedLines.add(switchedLine.substring(0, switchedLine.length() - 1));
        }

        return switchedLines;
    }

    public static void main(String[] args) {
        WordSwitcher wordSwitcher = new WordSwitcher();

        String readingPath = "/Users/gokhanpolat/Developer/tallinn5/words.txt";
        String writingPath = "/Users/gokhanpolat/Developer/tallinn5/switchedWords.txt";

        List<String> lines = wordSwitcher.readFile(readingPath);

        wordSwitcher.writeFile(writingPath, lines);
    }
}
