//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...

public class Printer {
    public static void main(String[] args) {
        printer("fourth");

    }
    public static void printer(String... input) {
        for(String i: input)
        System.out.println(i);
    }
}
