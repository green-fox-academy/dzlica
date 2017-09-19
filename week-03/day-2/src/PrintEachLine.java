import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

        // Write a program that opens a file called "my-file.txt", then prints
        // each of lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"


public class PrintEachLine {
    public static void main(String[] args) {
        try {
            Path myPath = Paths.get( "src/my-file.txt");
            List<String> lines = Files.readAllLines(myPath);
            System.out.println(lines);
        } catch (Exception e) {
            System.out.println("Unable to read the file!");
        }

    }
}
