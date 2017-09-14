
// Write a program that asks for two numbers and prints the bigger one
import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me two numbers:");
        int numberOne = myScanner.nextInt();
        int numberTwo = myScanner.nextInt();
        if (numberOne > numberTwo) {
            System.out.println(numberOne);
        }
        else System.out.println(numberTwo);
    }
}
