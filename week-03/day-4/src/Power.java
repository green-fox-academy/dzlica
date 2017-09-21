// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {
    public static void main(String[] args) {
        int base = 3;
        int n = 3;
        System.out.println(powerN(n, base));
    }

    private static int powerN(int n, int base) {
        if (n == 1) {
            return base;
        }
        else return base * powerN(n - 1, base);
    }
}
