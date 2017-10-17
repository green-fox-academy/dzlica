import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class PokerDojoTest {
    PokerDojo pokerTest = new PokerDojo();
    PokerDojo pokerTest2 = new PokerDojo();
    ArrayList<String> cards = new ArrayList<>(Arrays.asList("D3", "S4", "H12", "H3", "C14"));


    @Test
    public void test1() {
        assertTrue(pokerTest.colors.contains("C"));
    }

    @Test
    public void test2() {
        assertTrue(pokerTest2.values.contains("13"));
    }

    @Test
    public void testSortingCards() {
        assertEquals(14, pokerTest.biggestCards(pokerTest.cards1));
    }

    @Test
    public void testSortingCards2() {
        assertEquals(11, pokerTest.biggestCards(pokerTest.cards2));
    }

    @Test
    public void compare() {
        assertEquals(14, pokerTest.compareCards(cards));
    }


}