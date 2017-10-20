import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoLista {
    Scanner myScanner = new Scanner(System.in);
    String input;
    ArrayList<String> lines;
    String [] args;
    ReadWriteFiles filePath = new ReadWriteFiles();
    Path myPath;
    CreatingId uniqueID = new CreatingId();


    public TodoLista() {
        this.input = myScanner.nextLine();
        this.args = new String[2];
        this.args[0] = this.input.substring(0,2);
        if (this.input.length() > 2) {
            this.args[1] = this.input.substring(3);
        }
        else this.args[1] = "";

        this.lines = new ArrayList<>();
        this.myPath = Paths.get("/Users/lica/GreenFox/dzlica/week-06/day-5/todoapp/src/main/java/todolist.txt");


    }

    public TodoLista(String[] args) {
        this.args = args;
        this.lines = new ArrayList<>();
    }

    public void newTask() {

        if (this.args[0].equals("-a")) {
            if (this.args[1] == null || this.args[1].equals("")) {
                System.out.println("Unable to add: no task provided");
                return;
            }
            try {
                filePath.ReadFile();
                List<String> lines = Files.readAllLines(myPath);
                lines.add(uniqueID.createID() + " " + this.args[1]);
                Files.write(myPath, lines);

            } catch (Exception e) {
                System.out.println("Unable to read the file!");
            }
        }
    }

    public void listTask() {

        if (this.args[0].equals("-l")) {
            try {
                filePath.ReadFile();
                List<String> lines = Files.readAllLines(myPath);
                if (lines.size() == 0) {
                    System.out.println("No todos for today");
                    return;
                }
                for (int i = 0; i < lines.size(); i++) {
                    System.out.println(lines.get(i).substring(1));
                }

            } catch (Exception e) {
                System.out.println("Unable to read the file!");
            }
        }
    }

    public void removeTask() {
        try {
            filePath.ReadFile();
            List<String> lines = Files.readAllLines(myPath);
            if (this.args[0].equals("-r")) {
                if (this.args[1] == null || this.args[1].equals(""))
                    System.out.println("Unable to remove: no index provided");

                if (1 <= lines.size()) {
                    String toNumber = this.args[1];
                    try {
                        int result = Integer.parseInt(toNumber);
                        if (result > lines.size()) {
                            System.out.println("Unable to remove: index is out of bound");
                        } else lines.remove(result - 1);
                        Files.write(myPath, lines);
                    } catch (NumberFormatException e) {
                        System.out.println("Unable to remove: index is not a number");
                    }
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void checkTask() {
        try {
            filePath.ReadFile();
            List<String> lines = Files.readAllLines(myPath);
            if (1 <= lines.size() && this.args[0].equals("-c")) {
                String toNumber = this.args[1];
                int result = Integer.parseInt(toNumber);
                lines.set(result - 1, "+" + lines.get(result - 1).substring(1));
                Files.write(myPath, lines);
            }

        } catch(Exception e){

             }
        }


    public void argumentError() {
        if (!(this.args[0].equals("-r") || this.args[0].equals("-a") || this.args[0].equals("-l") || this.args[0].equals("-c"))) {
            System.out.println("Unsupported argument");
            CommandLineArgs printit = new CommandLineArgs();
            printit.listingHelp();
        }
    }


}

