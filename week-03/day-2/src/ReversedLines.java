import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

// Create a method that decrypts reversed-lines.txt

public class ReversedLines {
    public static void main(String[] args) {
        Path reverseOriginal = Paths.get("reversed-lines.txt");
        Path reversedReady = Paths.get("reversed-ready.txt");
        try {
            List<String> readOriginal = Files.readAllLines(reverseOriginal);
            List<String> readReady = wantToReverse(readOriginal);
            for (int i = 0; i < readReady.size(); i++) {
                System.out.println(readReady.get(i));
            }
            Files.write(reversedReady, readReady);
        } catch (Exception e) {
            System.out.println("Something wrong");
        }
    }

    private static List<String> wantToReverse(List<String> readOriginal) {
        ArrayList<String> toReturn = new ArrayList<>();
        for (int i = 0; i < readOriginal.size(); i++) {
            String ujSor = "";
            for (int j = readOriginal.get(i).length()-1; j >= 0; j--) {
                ujSor += readOriginal.get(i).charAt(j);
            }
            toReturn.add(ujSor);

        }
        return toReturn;
    }
}
