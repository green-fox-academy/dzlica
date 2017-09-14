// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The seconf represents the number of pigs the farmer has
// It should print how many legs all the animals have

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int chickenLegs = myScanner.nextInt();
        int pigs = myScanner.nextInt();
        System.out.println(chickenLegs * 4 + pigs * 2);
    }
}
