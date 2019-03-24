package week7.new_input_output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewIOUsages {

    public static void main(String[] args) throws IOException {
        String pathString = "/Users/gokhanpolat/Developer/tallinn5/test";
        Path path = Paths.get(pathString);

        System.out.println(Files.isDirectory(path)); // isDirectory method returns true if the directory is exist

        if (!Files.isDirectory(path)) {
            Files.createDirectory(path); // createDirectory method creates a directory if it doesn't exist.
            // if the directory is already exist, jvm throws FileAlreadyExistsException
        }

        String existingFilePathString = "/Users/gokhanpolat/Developer/tallinn5/symbolictest.txt";
        String symLinkPathString = "/Users/gokhanpolat/Developer/tallinn5/symbolictestShortcut.txt";
        Path symLinkPath = Paths.get(symLinkPathString);
        Path existingFilePath = Paths.get(existingFilePathString);
        Files.createSymbolicLink(symLinkPath, existingFilePath);
    }

}
