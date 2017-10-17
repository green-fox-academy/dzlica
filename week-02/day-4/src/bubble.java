import java.util.Scanner;
import java.util.*;

public class bubble {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        ArrayList<Integer> inputList = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Give me a number");
            int number = myScanner.nextInt();
            inputList.add(number);
        }
        ArrayList<Integer> eredmeny = izebize(inputList);

        for (int i = 0; i < eredmeny.size(); i++) {
            System.out.println(eredmeny.get(i));
        }

    }
    public static ArrayList<Integer> izebize (ArrayList<Integer> szamlista) {
        boolean vancsere = true;
        while ( vancsere == true) {
            vancsere = false;
            for (int i = 1; i < szamlista.size(); i++) {
                if (szamlista.get(i) < szamlista.get(i-1)) {
                    int temporary = szamlista.get(i-1);
                    szamlista.set(i-1, szamlista.get(i));
                    szamlista.set(i, temporary);
                    vancsere = true;
                }

            }
        }
        return szamlista;
    }
}
