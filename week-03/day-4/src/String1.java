// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class String1 {
    public static void main(String[] args) {
        String myString = "dxlkjxoi";
        System.out.println(lowToUpper(myString));
    }

    private static String lowToUpper(String myString) {
        if (myString.indexOf("x") == 0) {
            return myString;
        }
        else return myString.replace("x", "Y");
    }
}
