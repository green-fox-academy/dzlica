import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int myNumber = myScanner.nextInt();
        if (myNumber % 2 == 0) {
            System.out.println("This is an even number");
        }
        else {
            System.out.println("This is an odd number");
        }
    }

}
