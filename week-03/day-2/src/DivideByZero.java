// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number:");
        int divisor = scanner.nextInt();
        try {
            int result = 10 / divisor;
            System.out.println("The result is: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("You can't devide by zero");
        }
    }
}
