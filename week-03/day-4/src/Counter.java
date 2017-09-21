// Write a recursive function that takes one parameter: n and counts down from n.



public class Counter {
    public static void main(String[] args) {
        int n = 12;
        countNumbers(n);


    }
    public static int countNumbers(int n) {
        System.out.println(n);
        if (n == 0) {
            return n;
        }
        else countNumbers(n - 1);
        return n;
    }


}
