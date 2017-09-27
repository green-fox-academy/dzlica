import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {
    Sharpie testSharpie = new Sharpie("yellow", 100);

    @Test
    public void testUse() {
        testSharpie.use(1);
        assertEquals(95, testSharpie.inkAmount, 0.00001);
    }

}
