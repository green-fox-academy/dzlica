public class Reverse {
    public static void main(String... args){

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        reversed = toReverse(reversed);
        // reversed = new StringBuffer(reversed).reverse().toString();


        // Create a function that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.
        System.out.println(reversed);

    }
    public static String toReverse(String reversed) {
        String result = "";
        for (int i = reversed.length()-1; i >= 0; i--) {
           result = result + reversed.charAt(i);
        }
        return result;
    }

}



// String result="";
//for (int i=string.length()-1; i>=0; i--) {
//result = result + string.charAt(i);
