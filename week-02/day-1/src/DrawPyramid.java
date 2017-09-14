// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me a number:");
        int a = myScanner.nextInt();
        int csillagszam = 1;
        int  szokozszam = a - 1;
        for ( int sor = 1; sor <= a; sor++ ) {
            for (int szk = 0; szk < szokozszam; szk++) {
                System.out.print(" ");
            }
            for ( int csillag = 1; csillag <= csillagszam; csillag++ ) {
                System.out.print("*");
            }
            System.out.println();
            csillagszam+=2;
            szokozszam--;
        }


        }

    }
