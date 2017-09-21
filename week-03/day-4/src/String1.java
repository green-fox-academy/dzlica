// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class String1 {
    public static void main(String[] args) {
        String myString = "dxlkjxoi";
        System.out.println(lowToUpper(myString));
    }

    private static String lowToUpper(String myString) {
        String ret = "";
        if (myString.length() < 1) {
            return ret;
        }
        if (myString.charAt(0) == 'x') {
            ret = "y" + lowToUpper(myString.substring(1));
        } else {
            ret = myString.charAt(0) + lowToUpper(myString.substring(1));
        }
        return ret;
    }

    }

