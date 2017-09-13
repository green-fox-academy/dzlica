/* public class Reverse {
    public static void main(String... args){

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // reversed = new StringBuffer(reversed).reverse().toString();


        // Create a function that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

       System.out.println(reversed);

    }
    public static String reversedText(String toBeReversed) {
        for (int i = toBeReversed.length()-1; i >= 0; i--) {
            toBeReversed = toBeReversed.charAt(i);
            String theResult = toBeReversed;
        }
        return toBeReversed;
    }
}
// String result="";
//for (int i=string.length()-1; i>=0; i--) {
//result = result + string.charAt(i);
*/