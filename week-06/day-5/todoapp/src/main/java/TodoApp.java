import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TodoApp {
    public static void main(String [] args) {

        CommandLineArgs printit = new CommandLineArgs();
        printit.listingHelp();

        TodoListaUj teszPeldany = new TodoListaUj();
        teszPeldany.Tasks(args);


    }
}

