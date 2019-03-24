package week7.new_input_output;

import java.io.*;

public class ComputerSerialization {

    public void writeFile(String writingPath, Computer computer) {
        try {
            File file = new File(writingPath);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(computer);

            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(String readingPath) {
        Computer computer;
        try {
            File file = new File(readingPath);
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            computer = (Computer) objectInputStream.readObject();

            System.out.println(computer.getBrand());
            System.out.println(computer.getOperatingSystem());
            System.out.println(computer.getType());

            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ComputerSerialization computerSerialization = new ComputerSerialization();
        Computer computer = new Computer("apple", "macOs", "laptop");

        String path = "/Users/gokhanpolat/Developer/tallinn5/computer.txt";

        computerSerialization.writeFile(path, computer);

        computerSerialization.readFile(path);
    }
}
