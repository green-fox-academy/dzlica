//Create a function named create palindrome following your current language's style guide.
// It should take a string, create a palindrome from it and then return it.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Give me a word:");
        String wordInput = myScanner.nextLine();
        String wordTemp = wordInput;
        wordInput = pallidrome(wordInput);
        System.out.println(wordTemp + wordInput);

    }

    private static String pallidrome(String wordInput) {
        String Store = "";
        for (int i = wordInput.length()-1; i >= 0; i--) {
            Store = Store + wordInput.charAt(i);
        }
        return Store;
    }
}
