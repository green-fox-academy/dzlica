// Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class String2 {
    public static void main(String[] args) {
        String myString = "dxlkxxxx";
        System.out.println(removeX(myString));
    }

    private static String removeX(String myString) {
         String ret = "";
         if (myString.length() < 1) {
             return ret;
         }
         if (myString.charAt(0) == 'x') {
             ret = " " + removeX(myString.substring(1));
         }
         else {
             ret = myString.charAt(0) + removeX(myString.substring(1));
         }
         return ret;
    }
}
