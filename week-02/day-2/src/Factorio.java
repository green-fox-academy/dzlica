//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
public class Factorio {
    public static void main(String[] args) {
        System.out.println(Factorio(4));
    }
    public static int Factorio(int input) {
        int fact = 1;
        for (int i = input; i > 1; i--) {
            fact *= i;
        }
        return fact;
    }
}
