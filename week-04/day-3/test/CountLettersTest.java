import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {
    String testLetters = "alma";
    HashMap testMap = new HashMap();

    @Test
    public void testCounting() {
        HashMap expectMap = new HashMap();
        expectMap.put('a', 2);
        expectMap.put('l', 1);
        expectMap.put('m', 1);
        CountLetters cl = new CountLetters();
//        testMap = cl.counting(testLetters);
        assertEquals(expectMap, cl.counting(testLetters));
    }

}