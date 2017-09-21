// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunny1 {
    public static void main(String[] args) {
        int bunny = 24;
        System.out.println(bunnyEars(bunny));
    }

    private static int bunnyEars(int bunny) {
        if (bunny == 1) {
            return 2;
        }
        else return 2 + bunnyEars(bunny - 1);
    }
}
