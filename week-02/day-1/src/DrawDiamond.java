// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was
import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me a number:");
        int a = myScanner.nextInt();
        int csillagszam = 1;
        int szokozszam = a - 1;
        for (int sor = 0; sor < a/2; sor++) {
            for (int szokoz = 0; szokoz < szokozszam; szokoz++) {
                System.out.print(" ");
            }
            for (int csillag = 0; csillag < csillagszam; csillag++) {
                System.out.print("*");
            }
            System.out.println();
            csillagszam+=2;
            szokozszam--;
            }
        for (int sorle = 0; sorle <= a/2; sorle++) {
            for (int szokoz = 0; szokoz < szokozszam; szokoz++) {
                System.out.print(" ");
            }
            for (int csillagle = 0; csillagle < csillagszam; csillagle++) {
                System.out.print("*");
            }
            System.out.println();
            szokozszam++;
            csillagszam-=2;
        }

    }
}
