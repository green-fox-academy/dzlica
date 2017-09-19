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
            for(int i = 0; i < removed.size(); i++) {
                System.out.println(removed.get(i));
            }
            Files.write(removedChars, removed);

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
    public static ArrayList wantToRemove(List<String> letsDoIt) {
        ArrayList<String > toReturn = new ArrayList<>();
        for (int i = 0; i < letsDoIt.size(); i++) {
            String ujSor = "";
            for (int j = 0; j < letsDoIt.get(i).length()-1; j++) {
                if (j % 2 == 0) {
                    ujSor += letsDoIt.get(i).charAt(j);
                }
            }
            toReturn.add(ujSor);
            }
        return toReturn;

        }


    }

