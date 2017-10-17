import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        Path orderOriginal = Paths.get("reversed.order.txt");
        Path orderReady = Paths.get("reversed.order.ready.txt");
        try {
            List<String> readOrder = Files.readAllLines(orderOriginal);
            List<String> orderToWrite = toReverse(readOrder);

            for (int i = 0; i < orderToWrite.size(); i++) {
                System.out.println(orderToWrite.get(i));
            }
            Files.write(orderReady, orderToWrite);

        } catch (Exception e) {
            System.out.println("Something wrong");
        }
    }

    private static List<String> toReverse(List<String> letsDoIt) {
        List<String> toReturn = new ArrayList<>();
        String ujSor = "";
        for (int i = letsDoIt.size() - 1; i > 0; i--) {
            ujSor += letsDoIt.get(i);
        }
        toReturn.add(ujSor);

        return toReturn;
    }
}
