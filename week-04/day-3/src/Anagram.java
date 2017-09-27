public class Anagram {

    public boolean takeAnagram(String inputOne, String inputTwo) {
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
