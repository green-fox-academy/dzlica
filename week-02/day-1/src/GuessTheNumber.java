// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber = 8;
        System.out.println("Give me a number");
        int giveNumber = scanner.nextInt();
        while ( giveNumber != myNumber) {

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
