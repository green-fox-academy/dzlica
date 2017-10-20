import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TodoListaUj {
    ArrayList<String> lines;
    ReadWriteFiles filePath = new ReadWriteFiles();
    Path myPath;
    CreatingId uniqueID = new CreatingId();

    public TodoListaUj() {
        this.lines = new ArrayList<>();
        this.myPath = Paths.get("/Users/lica/GreenFox/dzlica/week-06/day-5/todoapp/src/main/java/todolist.txt");
    }

    public void Tasks(String[] args) {
        OptionParser parser = new OptionParser();
        parser.accepts("a").withRequiredArg();
        OptionSet options = parser.parse(args);


        if (options.has("a")) {
            try {
                filePath.ReadFile();
                List<String> lines = Files.readAllLines(myPath);
                lines.add(String.valueOf(options.valueOf("a")));
                Files.write(myPath, lines);

            } catch (Exception e) {
                System.out.println("Unable to read the file!");
            }
        }
    }
}
