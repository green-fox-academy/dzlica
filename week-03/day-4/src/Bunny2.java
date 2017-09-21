// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class Bunny2 {
    public static void main(String[] args) {
        int bunny = 4;
        System.out.println(earsNumber(bunny));
    }

    private static int earsNumber(int bunny) {
        if (bunny == 1) {
            return 2;
        }
        else if (bunny % 2 == 1) {
            return 2 + earsNumber(bunny - 1);
        }
        else return  3 + earsNumber(bunny - 1);
    }
}
