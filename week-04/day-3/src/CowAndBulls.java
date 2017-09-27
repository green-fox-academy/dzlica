import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class CowAndBulls {

    int[] number = new int[4];
    int[] yourGuess;
    int count;


    public CowAndBulls() {

    }

    public int[] myNumber() {
        for (int i = 0; i < this.number.length; i++) {
            this.number[i] = (int) (Math.random() * 9);

        }
        return this.number;
    }

    public int[] number2array(int temp) {
        int[] yourNumber = new int[4];
        int i = 3;
        do {
            yourNumber[i] = temp % 10;
            temp /= 10;
            i--;
        } while (temp > 0);
        return yourNumber;
    }


    public void guessIt() {
        boolean vanBull = true;
        while (vanBull == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give me a 4 digit number:\n");
            int yourNumber = scanner.nextInt();
            this.yourGuess = number2array(yourNumber);
            vanBull = false;
            for (int i = 0; i < this.number.length; i++) {
                if (this.number[i] != this.yourGuess[i]) {
                    System.out.print("bull ");
                    vanBull = true;
                } else System.out.print("cow ");
            }
            this.count++;
        }
        System.out.println("You rock! Number of tries: " + this.count);


    }

}
