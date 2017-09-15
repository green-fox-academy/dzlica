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
        for (int i = 0; i < inputOne.length(); i++) {
            char c = inputOne.charAt(i);
            for (int j = 0; j < i; j++) {
                char d = inputTwo.charAt(j);
                if (c == d) {
                    return true;
                } else {
                    return false;
                }
            }

        }
        return vissza;
    }
}

