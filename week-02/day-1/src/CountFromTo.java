import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int a = myScanner.nextInt();
        System.out.println("Give me another number");
        int b = myScanner.nextInt();
        if(a > b) {
            System.out.println("The second number should be bigger");
        }
        else {
            for(int x = a; x <= b; x++)
            System.out.println(x);
        }
    }
}
