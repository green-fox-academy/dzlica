import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Distance in km?");
        int km = myScanner.nextInt();
        System.out.println("This is " + km * 0.62137119 + " in miles");
    }
}
