import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int myNumber = myScanner.nextInt();
        if (myNumber <= 0) {
            System.out.println("Not enough!");
        }
        else if (myNumber == 1) {
            System.out.println("One");
        }
        else if (myNumber == 2) {
            System.out.println("Two");
        }
        else {
            System.out.println("A lot");
        }
    }
}
