import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please give me the number of the girls");
        int girlNumber = myScanner.nextInt();
        System.out.println("Please give me the numbers of the boys");
        int boyNumber = myScanner.nextInt();
        if (girlNumber == 0) {
            System.out.println("Sausage party");
        }
        else if (girlNumber == boyNumber && (girlNumber + boyNumber) > 20) {
            System.out.println("The party is exellent!");
        }
        else if (girlNumber != boyNumber && (girlNumber + boyNumber) > 20) {
            System.out.println("Quite cool party");
        }
        else if (girlNumber + boyNumber < 20) {
            System.out.println("Average party");
        }

    }
}
