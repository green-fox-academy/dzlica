import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadWriteFiles {

    public void ReadFile() {
        try {
            Path myPath = Paths.get("/Users/lica/GreenFox/dzlica/week-06/day-5/todoapp/src/main/java/todolist.txt");
            List<String> lines = Files.readAllLines(myPath);
        } catch (Exception e) {
            System.out.println("Unable to read the file!");
        }
    }

    public void writeFile() {
        try {
            Path myPath = Paths.get("/Users/lica/GreenFox/dzlica/week-06/day-5/todoapp/src/main/java/todolist.txt");
            List<String> lines = Files.readAllLines(myPath);
            Files.write(myPath, lines);
        } catch (Exception e) {
            System.out.println("Can't read this file");
        }
    }
}
