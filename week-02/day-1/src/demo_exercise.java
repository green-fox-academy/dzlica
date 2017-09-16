import java.util.Scanner;

public class demo_exercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me a number:");
        int a = myScanner.nextInt();
        int Stars = 1;
        int  Space = a - 1;
        for ( int i = 1; i <= a; i++ ) {
            for (int k = 0; k < Space; k++) {
                System.out.print(" ");
            }
            for ( int j = 1; j <= Stars; j++ ) {
                System.out.print("*");
            }
            System.out.println();
            Stars+=2;
            Space--;
        }


    }
}

