// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me a number!");
        int a = myScanner.nextInt();
        System.out.println("%%%%%");
        for (int i = 1; i <= a - 2; i++) {

            System.out.print("%   %");
            System.out.println();


        }
        System.out.print("%%%%%");


    }
}
