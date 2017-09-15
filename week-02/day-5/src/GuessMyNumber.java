import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What will be the range, give me where to start");
        int to = scanner.nextInt();
        System.out.println("What will be the range, give me where to finish");
        int from = scanner.nextInt();
        int myNumber = (int)(Math.random() * (to - from) + from);

        System.out.println("Guess my number!");
        int giveNumber = scanner.nextInt();

        while ( giveNumber != myNumber ) {
            if (giveNumber < myNumber) {
                System.out.println("The stored number is higher");
            } else if (giveNumber > myNumber) {
                System.out.println("The stores number is lower");
            } else if (giveNumber != myNumber) {
                System.out.println("Give me another number");
            }
            giveNumber = scanner.nextInt();
        }
        System.out.println("You found the number");

    }
}
