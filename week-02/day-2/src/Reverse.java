
// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

public class Reverse {
    public static void main(String[] args) {
        int [] aj = {3, 4, 5, 6, 7};
        for (int i = 0; i < 5; i++) {
            System.out.println(aj[4-i]);
        }
    }
}
