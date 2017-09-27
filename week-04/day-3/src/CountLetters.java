import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    String letters;


    public CountLetters() {
        //this.letters = letters;
    }

    public HashMap counting(String letters) {
        HashMap dictionary = new HashMap();
        for (int i = 0; i < letters.length(); i++) {
            if (dictionary.get(letters.charAt(i)) == null) {
                dictionary.put(letters.charAt(i), 1);
            } else {
                dictionary.put(letters.charAt(i), (int)dictionary.get(letters.charAt(i)) + 1);
            }
        }
        return dictionary;
    }

}
