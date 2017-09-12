// - Write a function called `sum` that sum all the numbers
//   until the given parameter

public class Sum {
    public static void main(String[] args) {
        System.out.println(Sum(5));

    }
    public static int Sum(int end) {
        int start = 0;
        for(int i = 0 ; i < end ; i++) {
            start = start + i;
        }
        return start;
    }
}
