import java.util.Scanner;


public class Anagram {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me a word:");
        String inputOne = myScanner.nextLine();
        System.out.println("Give me another word:");
        String inputTwo = myScanner.nextLine();


        boolean igaze = Anagram(inputOne, inputTwo);
        if (igaze) {
            System.out.println("This is an anagram");
        }
        else {
            System.out.println("This is not an anagram");
        }
//function
    }

    public static boolean Anagram(String inputOne, String inputTwo) {
        boolean vissza = true;
        if (inputOne.length() != inputTwo.length()) {
            return false;
        }
        for (int i = 0; i < inputOne.length(); i++) {
            char c = inputOne.charAt(i);
            boolean megvan = false;
            for (int j = 0; j < inputTwo.length(); j++) {
                char d = inputTwo.charAt(j);
                if (c == d) {
                    megvan = true;
                }
            }
            if (megvan == false) {
                return false;
            }
        }
        return vissza;
    }
}

