// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.nio.file.Files;
import java.util.ArrayList;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {

        try {
            Path firstPath = Paths.get("my-file.txt");
            Path secondPath = Paths.get("my-copy-file2.txt");
            List<String> firstLines = Files.readAllLines(firstPath);
            Files.write(secondPath, firstLines);
            List<String> secondCopied = Files.readAllLines(secondPath);
            if (firstLines.containsAll(secondCopied)) {
                System.out.println("Same content!");
            }
        } catch (Exception e) {
            System.out.println("Did not copy");
        }
    }
}
