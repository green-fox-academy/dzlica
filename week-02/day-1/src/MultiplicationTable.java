import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int myNumber = myScanner.nextInt();
        int a = 1;
        while(a <= 15) {
            System.out.println(myNumber + " * " + a + " = " + a * myNumber);
            a++;
        }
    }
}
