import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"


public class WritesSingleLine {
    public static void main(String[] args) {
        Path myPath = Paths.get("my-file.txt");
        List<String> fileContent = new ArrayList<>();
        try {
            fileContent.add("Magdalena Dzindzisz");
            Files.write(myPath, fileContent);
            System.out.println(fileContent);
        } catch (Exception e) {
            System.out.println("Unable to write file my-file.txt");
        }

    }
}
