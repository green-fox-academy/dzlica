// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.nio.file.Files;
import java.util.Scanner;
import java.util.List;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.File;

public class CountTheLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a filename:");
        String fileName = scanner.nextLine();
        Path myPath = Paths.get(fileName);
        try {
            long lineCount = Files.lines(myPath).count();
            System.out.println(lineCount);
        } catch (Exception e) {
            System.out.println("Can't open the file");
        }
    }
}
