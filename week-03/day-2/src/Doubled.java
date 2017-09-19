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
            List<String> removed = wantToRemove(deCrypt);
            System.out.println(removed);
            Files.write(removedChars, removed);

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
    public static ArrayList wantToRemove(List<String> letsDoIt) {
        ArrayList<String > toReturn = new ArrayList<>(letsDoIt);
        for (int i = 0; i < letsDoIt.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (letsDoIt.size() % 2 == 0) {
                    toReturn.add(letsDoIt.remove(i));
                }
            }
            }
        return toReturn;

        }


    }

