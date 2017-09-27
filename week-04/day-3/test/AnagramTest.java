import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    Anagram anagramPeldany = new Anagram();
    String anagramOne = "wi";
    String anagramTwo = "iw";

    @Test
    public void testAnagram() {

        assertTrue(anagramPeldany.takeAnagram(anagramOne, anagramTwo));
    }

}