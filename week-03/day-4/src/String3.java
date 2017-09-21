// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

public class String3 {
    public static void main(String[] args) {
        String myString = "asdfgas";
        System.out.println(adjacentChar(myString));
    }

    private static String adjacentChar(String myString) {
        String ret = "";
        if (myString.length() < 1) {
            return ret;
        }
        else ret = myString.charAt(0) + "*" + adjacentChar(myString.substring(1));
        return ret;
    }
}
