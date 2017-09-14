
// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me 5 numbers");
        int numberOne = myScanner.nextInt();
        int numberTwo = myScanner.nextInt();
        int numberThree = myScanner.nextInt();
        int numberFour = myScanner.nextInt();
        int numberFive = myScanner.nextInt();
        int sum = numberOne + numberTwo + numberThree + numberFour + numberFive;
        double average = sum / 5;
        System.out.println("Sum: " + sum + ", Average: " + average);

    }
}
