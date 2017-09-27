import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    String apple = "apple";
    Apple myApple = new Apple();

    @Test
    public void testApple() {
        assertEquals(apple, myApple.getApple());
    }

}