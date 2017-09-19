// Create a method that decrypts the duplicated-chars.txt

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class Doubled {
    public static void main(String[] args) {
        Path duplicated = Paths.get("duplicated-chars.txt");
        Path removedChars = Paths.get("removedChars.txt");
        try {
            List<String> deCrypt = Files.readAllLines(duplicated);
            List<String> removed = WantToRemove(deCrypt);
            Files.write(removedChars, removed);

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
    public static ArrayList WantToRemove(List<String> LetsDoIt) {
        ArrayList<String > toReturn = new ArrayList<>();
        for (int i = 0; i < LetsDoIt.size(); i++) {
            if (LetsDoIt.size() % 2 == 0) {
                LetsDoIt.remove(i);
                }
            }
        return toReturn;

        }


    }

