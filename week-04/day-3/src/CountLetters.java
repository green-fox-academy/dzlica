import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    String letters;


    public CountLetters() {
        this.letters = letters;
    }

    public Map counting(String letters) {
        HashMap dictionary = new HashMap();
        for (int i = 0; i < letters.length(); i++) {
            dictionary.put(letters.charAt(i), dictionary.get(letters.charAt(i) + 1));
        }
        return dictionary;
    }

}
